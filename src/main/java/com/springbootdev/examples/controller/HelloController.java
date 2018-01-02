package com.springbootdev.examples.controller;

import com.springbootdev.examples.config.AppConfiguration;
import com.springbootdev.examples.domain.model.ApplicationLog;
import com.springbootdev.examples.domain.repository.ApplicationLogRepository;
import com.springbootdev.examples.domain.service.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private AppConfiguration appConfiguration;

    @Autowired
    private EnvironmentService environmentService;

    @Autowired
    private ApplicationLogRepository repository;

    @PostMapping("/logs")
    public ApplicationLog createApplicationLog()
    {
        ApplicationLog applicationLog = new ApplicationLog();
        applicationLog.setConfiguration(appConfiguration.getName());
        applicationLog.setEnvironment(environmentService.getCurrentEnvironment());
        return repository.save(applicationLog);
    }
}
