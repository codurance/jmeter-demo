package com.codurance.jmeterdemo.greeting.model;

import java.time.LocalDateTime;

public class MyEvent {
    String id;
    LocalDateTime date;
    String payload;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "MyEvent{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", payload='" + payload + '\'' +
                '}';
    }
}
