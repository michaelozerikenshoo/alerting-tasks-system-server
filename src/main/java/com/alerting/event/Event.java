package com.alerting.event;

import java.util.Date;

public class Event {

    private int id;
    private String createDate;
    private String task;
    private String reportBackMethod;
    private String addressed;
    private String addressee;
    private String content;
    private String actionsMade;
    private EventStatus status;
    private Date timeOfClosure;
    private String rasham;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
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

    public String getAddressed() {
        return addressed;
    }

    public void setAddressed(String addressed) {
        this.addressed = addressed;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
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

    public Date getTimeOfClosure() {
        return timeOfClosure;
    }

    public void setTimeOfClosure(Date timeOfClosure) {
        this.timeOfClosure = timeOfClosure;
    }

    public String getRasham() {
        return rasham;
    }

    public void setRasham(String rasham) {
        this.rasham = rasham;
    }

}
