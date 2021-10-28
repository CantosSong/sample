package com.example.demo;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String test() {
        return "test";
    }

    @GetMapping("/url/test")
    public String urlTest() {
        return "test";
    }
}
