package com.alerting.controller;

import com.alerting.event.Event;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class EventController {

    @ResponseBody
    @RequestMapping(path = "/event/{id}", method = RequestMethod.GET)
    public Event getEvent(@PathVariable(name = "id") int id) {
        Event event = new Event();
        event.setId(id);
        return event;
    }

}
