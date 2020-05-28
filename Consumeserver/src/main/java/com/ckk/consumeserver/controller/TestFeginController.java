package com.ckk.consumeserver.controller;

import com.ckk.product.client.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFeginController {
    @Autowired
    private TestClient testClient;
    @RequestMapping("/test")
    public String Test(@RequestParam(value = "name",defaultValue = "ckk") String name){

        return  testClient.test1(name);
    }

}
