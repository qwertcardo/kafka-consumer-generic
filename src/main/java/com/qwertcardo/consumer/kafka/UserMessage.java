package com.qwertcardo.consumer.kafka;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UserMessage {
    private String email;
    private String username;
    private String password;
    private String name;
    private Integer age;

    public UserMessage() {
    }

    public UserMessage(String email, String username, String password, String name, Integer age) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
