package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.Month;

public class Forum {

    private final List<ForumUser> theForumListOfUsers = new ArrayList<>();

    public Forum() {
        theForumListOfUsers.add(new ForumUser(1, "Dylan Murphy",'M', LocalDate.of(1983, 5, 11),0));
        theForumListOfUsers.add(new ForumUser(2, "Morgan Walsh",'M', LocalDate.of(2014, 8, 15),21));
        theForumListOfUsers.add(new ForumUser(3, "Ryan Talley",'M', LocalDate.of(1983, 11, 12),0));
        theForumListOfUsers.add(new ForumUser(4, "Giancarlo Guerrero",'M', LocalDate.of(1989, 2, 2),105));
        theForumListOfUsers.add(new ForumUser(5, "Rafael Murphy",'M', LocalDate.of(2012, 9, 17),111));
        theForumListOfUsers.add(new ForumUser(6, "Madelynn Carson",'F', LocalDate.of(2000, 4, 28),99));
        theForumListOfUsers.add(new ForumUser(7, "Rafael Murphy",'M', LocalDate.of(1999, 6, 30),8));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumListOfUsers);
    }



}
