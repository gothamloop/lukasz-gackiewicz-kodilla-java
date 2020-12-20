package com.kodilla.hibernate.manytomany.facade;

public class FacadeException extends Exception {

    public static String NOTHING_FOUND = "I can't find";

    public FacadeException(String message) {
        super(message);
    }
}