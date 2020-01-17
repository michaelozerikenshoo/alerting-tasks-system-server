package com.alerting.event;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EventService {

    @Resource
    private EventDao eventDao;

    public Event getEventById(int id) {
        return eventDao.getEventById(id);
    }

    public List<Event> getAllEvents() {
        return eventDao.getAllEvents();
    }

    public int updateEvent(Event event) {
        return eventDao.updateEvent(event);
    }

    public int createEvent(Event event) {
        return eventDao.creteEvent(event);
    }

    public int deleteEventById(int eventId) {
        return eventDao.deleteEventById(eventId);
    }
}
