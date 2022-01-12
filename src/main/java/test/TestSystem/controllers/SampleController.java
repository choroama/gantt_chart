package test.TestSystem.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SampleController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello Spring Boot!";
    }
}