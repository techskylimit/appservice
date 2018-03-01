package com.shinchan.demo.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Shinchanlist implements Serializable {
    @Id
    private String    id;
    private String    vid;
    private String    name;
    private String    description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
