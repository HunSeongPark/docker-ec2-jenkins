package com.example.depexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Hunseong-Park
 * @date : 2022-12-16
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "ver_1";
    }
}
