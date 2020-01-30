package com.alerting.event;

import org.jooq.impl.DefaultDSLContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.jooq.impl.DSL.row;


@Service
public class EventDao {

    @Resource
    private DefaultDSLContext dslContext;

    public Event getById(int id) {
        return dslContext.select()
                .from(EventTable.TABLE_NAME)
                .where(EventTable.id.eq(id))
                .fetchOneInto(Event.class);
    }

    public List<Event> getByPageNumber(int pageNumber, int maxRowsPerPage) {
        return dslContext.select()
                .from(EventTable.TABLE_NAME)
                .limit(pageNumber * maxRowsPerPage, maxRowsPerPage)
                .fetchInto(Event.class);
    }

    public int update(Event event) {
        return dslContext.update(EventTable.TABLE_NAME)
                .set(
                        row(EventTable.task, EventTable.reportBackMethod, EventTable.from, EventTable.to, EventTable.content, EventTable.actionsMade, EventTable.status, EventTable.timeOfClosure, EventTable.rasham),
                        row(event.getTask(), event.getReportBackMethod(), event.getFrom(), event.getTo(), event.getContent(), event.getActionsMade(), event.getStatus(), event.getTimeOfClosure(), event.getRasham())
                )
                .where(EventTable.id.eq(event.getId()))
                .execute();
    }

    public int create(Event event) {
        return dslContext.insertInto(EventTable.TABLE_NAME)
                .set(EventTable.task, event.getTask())
                .set(EventTable.reportBackMethod, event.getReportBackMethod())
                .set(EventTable.from, event.getFrom())
                .set(EventTable.to, event.getTo())
                .set(EventTable.content, event.getContent())
                .set(EventTable.actionsMade, event.getActionsMade())
                .set(EventTable.status, event.getStatus())
                .set(EventTable.timeOfClosure, event.getTimeOfClosure())
                .set(EventTable.rasham, event.getRasham())
                .execute();
    }

    public int deleteById(int eventId) {
        return dslContext.delete(EventTable.TABLE_NAME)
                .where(EventTable.id.eq(eventId))
                .execute();
    }

    public Event getByIdAndStatus(int id, EventStatus eventStatus) {
        return dslContext.select()
                .from(EventTable.TABLE_NAME)
                .where(EventTable.id.eq(id))
                .and(EventTable.status.eq(eventStatus.name()))
                .fetchOneInto(Event.class);
    }
}
