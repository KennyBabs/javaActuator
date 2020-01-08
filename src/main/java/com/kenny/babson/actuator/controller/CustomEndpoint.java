package com.kenny.babson.actuator.controller;

import com.kenny.babson.actuator.model.UserDetail;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="ActuatorExample", enableByDefault = true)
public class CustomEndpoint {

    @ReadOperation
    public UserDetail getUserDetail(){
        return new UserDetail(1, "kenny", "learning how to use java actuator");
    }


}
