package com.ckk.product.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("microservicecloud-provider")
public interface TestClient {
    @RequestMapping("/test")
    public String test1(@RequestParam(value = "name",defaultValue = "ckk") String name);
}
