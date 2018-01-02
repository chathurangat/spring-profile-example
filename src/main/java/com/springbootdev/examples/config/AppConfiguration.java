package com.springbootdev.examples.config;

public class AppConfiguration
{
    private String name;

    public AppConfiguration(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
