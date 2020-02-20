package com.kaiburr.assessment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Server {
    private String name;
    @Id
    private Long id;
    private String language;
    private String framework;

    public Server() {
    }

    public Server(String name, Long id, String language, String framework) {
        this.name = name;
        this.id = id;
        this.language = language;
        this.framework = framework;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getLanguage() {
        return language;
    }

    public String getFramework() {
        return framework;
    }
}
