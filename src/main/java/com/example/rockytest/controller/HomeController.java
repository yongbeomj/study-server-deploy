package com.example.rockytest.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping()
    public String home() {
        log.info("home controller mapping");
        return "ok";
    }
}
