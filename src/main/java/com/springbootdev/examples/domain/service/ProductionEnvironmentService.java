package com.springbootdev.examples.domain.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProductionEnvironmentService implements EnvironmentService
{
    @Override
    public String getCurrentEnvironment()
    {
        return "production_environment";
    }
}
