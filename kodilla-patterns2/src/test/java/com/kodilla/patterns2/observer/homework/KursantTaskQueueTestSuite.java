package com.kodilla.patterns2.observer.homework;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class KursantTaskQueueTestSuite {

    @Test
    public void kursantTaskTest() {
        //GIVEN
        KursantTaskQueue kursant1 = new KursantTaskQueue("kursant1");
        KursantTaskQueue kursant2 = new KursantTaskQueue("kursant2");
        MentorKodilla firstMentor = new MentorKodilla("firstMentor");
        MentorKodilla secondMentor = new MentorKodilla("secondMentor");

        kursant1.registerObserver(firstMentor);
        kursant2.registerObserver(secondMentor);

        //WHEN
        kursant1.addTask("Task 1 - done");
        kursant2.addTask("Task 2 - done");
        kursant1.addTask("Task 3 - done");
        kursant2.addTask("Task 4 - done");

        //THEN
        Assert.assertEquals(2, firstMentor.getUpdateCount());
        Assert.assertEquals(2, secondMentor.getUpdateCount());
    }
}