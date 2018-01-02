package com.springbootdev.examples.domain.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("staging")
public class StagingEnvironmentService implements EnvironmentService
{
    @Override
    public String getCurrentEnvironment()
    {
        return "staging_environment";
    }
}
