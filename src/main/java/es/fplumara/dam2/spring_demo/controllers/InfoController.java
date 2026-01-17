package es.fplumara.dam2.spring_demo.controllers;

import es.fplumara.dam2.spring_demo.domain.AppInfo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    private final AppInfo appInfo;

    public InfoController(@Qualifier("devInfo") AppInfo appInfo) {
        this.appInfo = appInfo;
    }

    @GetMapping("/info")
    public AppInfo info() {
        return appInfo;
    }
}