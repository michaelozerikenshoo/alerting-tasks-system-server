package com.alerting.controller;

import com.alerting.event.Event;
import com.alerting.event.EventService;
import com.alerting.event.EventStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequestMapping("/api/event")
public class EventController {

    private Logger logger = LoggerFactory.getLogger(EventController.class);

    @Resource
    private EventService eventService;

    @ResponseBody
    @RequestMapping(path = "/{eventId}", method = RequestMethod.GET)
    public ResponseEntity<Event> getEventById(@PathVariable(name = "eventId") int eventId,
                                              @PathParam("Status") EventStatus status) {
        Event event = status != null ? eventService.getEventByIdAndStatus(eventId, status) :
                eventService.getEventById(eventId);
        try {
            return new ResponseEntity<>(event, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error while getting entity");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Event>> getEventsByPageNumber(@PathParam("pageNumber") int pageNumber,
                                                             @PathParam("MaxRowsPerPage") int MaxRowsPerPage) {
        try {
            return new ResponseEntity<>(eventService.getEventsByPageNumber(pageNumber, MaxRowsPerPage), HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error while getting all events");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
