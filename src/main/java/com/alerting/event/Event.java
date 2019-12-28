package com.alerting.event;

import java.sql.Time;
import java.util.Date;

public class Event {

    private int id;
    private Date date;
    private Time time;
    private String task;
    private String reportBackMethod;
    private String from;
    private String to;
    private String content;
    private String actionsMade;
    private EventStatus status;
    private Date timeOfClosue;
    private String rasham;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getReportBackMethod() {
        return reportBackMethod;
    }

    public void setReportBackMethod(String reportBackMethod) {
        this.reportBackMethod = reportBackMethod;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getActionsMade() {
        return actionsMade;
    }

    public void setActionsMade(String actionsMade) {
        this.actionsMade = actionsMade;
    }

    public EventStatus getStatus() {
        return status;
    }

    public void setStatus(EventStatus status) {
        this.status = status;
    }

    public Date getTimeOfClosue() {
        return timeOfClosue;
    }

    public void setTimeOfClosue(Date timeOfClosue) {
        this.timeOfClosue = timeOfClosue;
    }

    public String getRasham() {
        return rasham;
    }

    public void setRasham(String rasham) {
        this.rasham = rasham;
    }

}
