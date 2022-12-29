package com.example.depexample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Hunseong-Park
 * @date : 2022-12-16
 */
@RestController
public class IndexController {

    @Value("${hunseong.name}")
    private String name;

    @GetMapping("/")
    public String index() {
        return name;
    }
}
