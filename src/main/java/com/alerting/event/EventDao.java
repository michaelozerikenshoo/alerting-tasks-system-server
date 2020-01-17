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

    public Event getEventById(int id) {
        return dslContext.select()
                .from(EventTable.TABLE_NAME)
                .where(EventTable.id.eq(id))
                .fetchOneInto(Event.class);
    }

    public List<Event> getAllEvents() {
        return dslContext.select()
                .from(EventTable.TABLE_NAME)
                .fetchInto(Event.class);
    }

    public int updateEvent(Event event) {
        return dslContext.update(EventTable.TABLE_NAME)
                .set(
                        row(EventTable.createDate, EventTable.task, EventTable.reportBackMethod, EventTable.from, EventTable.to, EventTable.content, EventTable.actionsMade, EventTable.status, EventTable.timeOfClosure, EventTable.rasham),
                        row(event.getCreateDate(), event.getTask(), event.getReportBackMethod(), event.getFrom(), event.getTo(), event.getContent(), event.getActionsMade(), event.getStatus(), event.getTimeOfClosure(), event.getRasham())
                )
                .where(EventTable.id.eq(event.getId()))
                .execute();
    }

    public int creteEvent(Event event) {
        return dslContext.insertInto(EventTable.TABLE_NAME)
                .set(EventTable.createDate, getCurrentDate())
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

    private String getCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dtf.format(LocalDateTime.now());
    }

    public int deleteEventById(int eventId) {
        return dslContext.delete(EventTable.TABLE_NAME)
                .where(EventTable.id.eq(eventId))
                .execute();
    }
}
