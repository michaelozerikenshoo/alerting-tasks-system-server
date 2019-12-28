package com.alerting.controller;

import com.alerting.event.Event;
import com.alerting.event.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/api")
public class EventController {

    @Resource
    private EventService eventService;

    @ResponseBody
    @RequestMapping(path = "/event/{id}", method = RequestMethod.GET)
    public Event getEvent(@PathVariable(name = "id") int id) {
        return eventService.getEventById(id);
    }

    @ResponseBody
    @RequestMapping(path = "/event", method = RequestMethod.GET)
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @ResponseBody
    @RequestMapping(path = "/event", method = RequestMethod.POST)
    public int updateEvent(HttpServletRequest request, @RequestBody Event event) {
        return eventService.updateEvent(event).getId();
    }

    @ResponseBody
    @RequestMapping(path = "/event", method = RequestMethod.PUT)
    public int createEvent(HttpServletRequest request, @RequestBody Event event) {
        return eventService.createEvent(event).getId();
    }

}
