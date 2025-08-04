package com.szrthk.taskmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthcheck {
    @GetMapping("hc")
    public String health(){
        return ("System is working fine");
    }

}
