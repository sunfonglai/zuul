package com.sunfong.zuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/data/zuul/check")
public class ZuulCheckAliveController {

    @RequestMapping(value = "/alive")
    public String checkAlive(){
        return "Alive";
    }
}
