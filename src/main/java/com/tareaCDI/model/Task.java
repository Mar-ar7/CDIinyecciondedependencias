package com.tareaCDI.model;

import java.io.Serializable;

public class Task implements Serializable {
    private String description;

    public Task() {
    }

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
