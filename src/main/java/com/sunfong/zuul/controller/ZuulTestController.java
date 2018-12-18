package com.sunfong.zuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ZuulTestController {

    @RequestMapping(value = "/check/alive")
    public String checkAlive(){
        return "Alive";
    }

}
