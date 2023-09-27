package com.example.aeron;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AeronController {
    @GetMapping("/hello-world")
    @ResponseBody
    public String helloWorld() {
        return "Aeron.";
    }
}
