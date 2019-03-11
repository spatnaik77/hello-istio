package com.sidd.poc.istio;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class DemoController
{
    public DemoController() {

    }

    @GetMapping("/")
    public String hello() throws Exception {

        return "hello Istio";

    }
    @GetMapping("/version")
    public String getVersion() throws Exception {

        return "2.0";
    }
}
