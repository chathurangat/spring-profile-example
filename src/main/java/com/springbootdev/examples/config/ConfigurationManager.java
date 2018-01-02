package com.springbootdev.examples.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ConfigurationManager
{
    @Bean
    @Profile("dev")
    public AppConfiguration getDevelopmentConfiguration()
    {
        return new AppConfiguration("development_config");
    }

    @Bean
    @Profile("staging")
    public AppConfiguration getStagingConfiguration()
    {
        return new AppConfiguration("staging_config");
    }

    @Bean
    @Profile("prod")
    public AppConfiguration getProductionConfiguration()
    {
        return new AppConfiguration("production_config");
    }
}
