package com.ckk.product;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@SpringBootTest
class ProductApplicationTests {

    @Test
    void contextLoads() {
        String s="a";
        List a1= new ArrayList<>();
        Map m1= new HashMap<>();
        Map m2= new TreeMap();
        Map m3 = new ConcurrentHashMap();
        synchronized (this){

        }

    }

}
