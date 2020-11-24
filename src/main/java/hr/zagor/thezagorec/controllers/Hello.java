package hr.zagor.thezagorec.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
