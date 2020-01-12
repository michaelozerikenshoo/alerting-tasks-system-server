package com.alerting.event;

import org.jooq.Record;
import org.jooq.ResultQuery;
import org.jooq.RowCountQuery;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventDao { //TODO:finish

    @Resource
    private DefaultDSLContext defaultDSLContext;

    public Event getEventById(int id) {
        Event event = new Event();
        event.setId(id);
        event.setTask("kill him!");
        return event;
    }

    public List<Event> getAllEvents() {
        return new ArrayList<>();
    }

    public Event updateEvent(Event event) {
        return event;
    }

    public Event creteEvent(Event event) {
        return event;
    }
}
