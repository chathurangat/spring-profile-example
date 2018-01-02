package com.springbootdev.examples.domain.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevelopmentEnvironmentService implements EnvironmentService
{
    @Override
    public String getCurrentEnvironment()
    {
        return "development_environment";
    }
}
