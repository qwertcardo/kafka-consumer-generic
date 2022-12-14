package com.qwertcardo.consumer.kafka;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PublishingMessage {
    private String title;
    private String content;
    private UserMessage user;

    public PublishingMessage() {
    }

    public PublishingMessage(String title, String content, UserMessage user) {
        this.title = title;
        this.content = content;
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UserMessage getUser() {
        return user;
    }

    public void setUser(UserMessage user) {
        this.user = user;
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
