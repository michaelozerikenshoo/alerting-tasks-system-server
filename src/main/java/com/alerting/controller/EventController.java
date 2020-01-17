package com.alerting.controller;

import com.alerting.event.Event;
import com.alerting.event.EventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/api/event")
public class EventController {

    private Logger logger = LoggerFactory.getLogger(EventController.class);

    @Resource
    private EventService eventService;

    @ResponseBody
    @RequestMapping(path = "/{eventId}", method = RequestMethod.GET)
    public ResponseEntity<Event> getEventById(@PathVariable(name = "eventId") int eventId) {
        try {
            Event eventById = eventService.getEventById(eventId);
            if (eventById == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<>(eventById, HttpStatus.OK);
            }
        } catch (Exception e) {
            logger.error("Error while getting entity");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT)
    public int updateEvent(HttpServletRequest request, @RequestBody Event event) {
        return eventService.updateEvent(event);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public int createEvent(HttpServletRequest request, @RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @ResponseBody
    @RequestMapping(path = "/{eventId}", method = RequestMethod.DELETE)
    public int deleteEventById(@PathVariable(name = "eventId") int eventId) {
        return eventService.deleteEventById(eventId);
    }

}
