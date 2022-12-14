package org.allen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provide")
public class HelloController {

    @GetMapping("{message}")
    public String hello(@PathVariable String message) {
        return String.format("hello %s", message);
    }
}
