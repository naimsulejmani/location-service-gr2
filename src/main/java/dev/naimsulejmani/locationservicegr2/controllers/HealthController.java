package dev.naimsulejmani.locationservicegr2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/health")
public class HealthController {

    @GetMapping("/ping")
    public String pingMe() {
        return "pong";
    }

}
