package com.alerting.event;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EventService {

    @Resource
    private EventDao eventDao;

    public Event getEventById(int id) {
        return eventDao.getEventById(id);
    }
}
