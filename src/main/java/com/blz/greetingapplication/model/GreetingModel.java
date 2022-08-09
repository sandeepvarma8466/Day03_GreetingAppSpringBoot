package com.blz.greetingapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "greeting")
@Data
@AllArgsConstructor
public class GreetingModel {
    @Id
    private long id;
    private String message;

    public GreetingModel() {

    }

}
