package com.alerting.event;

import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventDao { //TODO:finish

    @Resource
    private DSLContext dslcontext;

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
