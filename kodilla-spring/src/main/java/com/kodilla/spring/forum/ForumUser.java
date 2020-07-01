package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

 private String username;

    public String ForumUser(){
        return this.username = "John Smith";
    }

    public String getUsername() {
        return username;
    }
}
