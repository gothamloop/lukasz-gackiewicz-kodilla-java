package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

   private int uniqueID;
   private String name;
   private char sex;
   private LocalDate birthDate;
   private int quantityOfPosts;

    public ForumUser(int uniqueID, String name, char sex, LocalDate birthDate, int quantityOfPosts) {
        this.uniqueID = uniqueID;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.quantityOfPosts = quantityOfPosts;
    }


    public int getUniqueID() {
        return uniqueID;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueID=" + uniqueID +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", quantityOfPosts=" + quantityOfPosts +
                '}';
    }
}
