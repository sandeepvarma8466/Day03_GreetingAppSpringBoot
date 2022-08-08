package com.example.greetingapplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GREETING")
public class GreetingModel {
    @Id
    private long id;
    private String message;

    public GreetingModel() {
        id = 0;
        message = "";
    }

    public GreetingModel(long id, String message) {

        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
