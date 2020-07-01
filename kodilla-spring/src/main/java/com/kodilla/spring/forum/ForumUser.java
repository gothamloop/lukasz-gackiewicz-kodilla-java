package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    private String username;

    public String ForumUser(String username){
        return "John Smith";
    }

    public String getUsername() {
        return username;
    }
}
