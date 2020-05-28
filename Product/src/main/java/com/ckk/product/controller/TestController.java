package com.ckk.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test1(@RequestParam(value = "name",defaultValue = "ckk") String name){
        return name;
    }
}
