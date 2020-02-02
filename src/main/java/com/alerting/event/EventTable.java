package com.alerting.event;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

public class EventTable {

    public static final Table<Record> TABLE_NAME = table("events");

    public static final Field<Object> id = field("id");
    public static final Field<Object> createDate = field("create_date");
    public static final Field<Object> task = field("task");
    public static final Field<Object> addressed = field("addressed");
    public static final Field<Object> addressee = field("addressee");
    public static final Field<Object> content = field("content");
    public static final Field<Object> actionsMade = field("actions_made");
    public static final Field<Object> status = field("status");
    public static final Field<Object> timeOfClosure = field("time_of_closure");
    public static final Field<Object> rasham = field("rasham");
}
