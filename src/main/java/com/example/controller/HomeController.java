package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    public String home() {
        logger.info("Executing HomeController.home()");
        return "home";
    }
}
