package com.alerting.event;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

public class EventTable {

    public static final Table<Record> TABLE_NAME = table("events");

    public static final Field<Object> id = field("id");
    public static final Field<Object> createDate = field("createDate");
    public static final Field<Object> task = field("task");
    public static final Field<Object> reportBackMethod = field("reportBackMethod");
    public static final Field<Object> from = field("from");
    public static final Field<Object> to = field("to");
    public static final Field<Object> content = field("content");
    public static final Field<Object> actionsMade = field("actionsMade");
    public static final Field<Object> status = field("status");
    public static final Field<Object> timeOfClosure = field("timeOfClosure");
    public static final Field<Object> rasham = field("rasham");
}
