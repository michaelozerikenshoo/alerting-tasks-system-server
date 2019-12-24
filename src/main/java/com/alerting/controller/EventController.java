package com.alerting.controller;

import com.alerting.HelloWorld;
import com.alerting.event.Event;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/api")
public class EventController {

    @Resource
    private HelloWorld helloWorld;

    @ResponseBody
    @RequestMapping(path = "/Event", method = RequestMethod.GET)
    public Event getEvent() {
        helloWorld.getMessage();
        return new Event();
    }


}
