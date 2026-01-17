package es.fplumara.dam2.spring_demo.controllers;

import es.fplumara.dam2.spring_demo.services.ApiClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private final ApiClientService service;

    public ApiController(ApiClientService service) {
        this.service = service;
    }

    @GetMapping("/api-summary")
    public String summary() {
        return service.summary();
    }
}