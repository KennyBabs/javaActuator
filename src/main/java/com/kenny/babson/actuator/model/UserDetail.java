package com.kenny.babson.actuator.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDetail {

    private long id;
    private String name;
    private String message;

}
