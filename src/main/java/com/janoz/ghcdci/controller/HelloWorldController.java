package com.janoz.ghcdci.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloWorldController {

    @RequestMapping({"/{name}", "/"})
    public String hello(@PathVariable(required = false) Optional<String> name) {
        return String.format("Hello %s!", name.orElse("World"));
    }
}
