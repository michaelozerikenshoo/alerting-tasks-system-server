package com.alerting.event;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EventService {

    @Resource
    private EventDao eventDao;

    public Event getEventById(int id) {
        return eventDao.getById(id);
    }

    public Event getEventByIdAndStatus(int id,EventStatus eventStatus) {
        return eventDao.getByIdAndStatus(id,eventStatus);
    }

    public List<Event> getEventsByPageNumber(int pageNumber, int maxRowsPerPage) {
        return eventDao.getByPageNumber(pageNumber,maxRowsPerPage);
    }

    public int updateEvent(Event event) {
        return eventDao.update(event);
    }

    public int createEvent(Event event) {
        return eventDao.create(event);
    }

    public int deleteEventById(int eventId) {
        return eventDao.deleteById(eventId);
    }
}
