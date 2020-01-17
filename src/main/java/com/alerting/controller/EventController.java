package com.alerting.controller;

import com.alerting.event.Event;
import com.alerting.event.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/api/event")
public class EventController {

    @Resource
    private EventService eventService;

    @ResponseBody
    @RequestMapping(path = "/{eventId}", method = RequestMethod.GET)
    public Event getEventById(@PathVariable(name = "eventId") int eventId) {
        return eventService.getEventById(eventId);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public int updateEvent(HttpServletRequest request, @RequestBody Event event) {
        return eventService.updateEvent(event);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT)
    public int createEvent(HttpServletRequest request, @RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @ResponseBody
    @RequestMapping(path = "/{eventId}", method = RequestMethod.DELETE)
    public int deleteEventById(@PathVariable(name = "eventId") int eventId) {
        return eventService.deleteEventById(eventId);
    }

}
