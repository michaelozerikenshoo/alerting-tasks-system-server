package com.alerting.event;

import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EventDao {

    @Resource
    private DSLContext dslcontext;

    public Event getEventById(int id) {
        return new Event();
    }
}
