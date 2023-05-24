package com.mongolu.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
@Document  // Collection oldugugunu belirtmek icin
public class User {
    @Id  // tabloya karsilik geldigini belirtmek icin spring anotasyonu bu collection in primary keyi olucak yani bu  yapi bi primary keye sahip demek
    private String id;
    private String name;
    private String surname;
    private HashMap properties;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public HashMap getProperties() {
        return properties;
    }

    public void setProperties(HashMap properties) {
        this.properties = properties;
    }
}
