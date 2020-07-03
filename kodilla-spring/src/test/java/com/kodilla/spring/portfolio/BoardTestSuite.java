package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    public void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String doneTask = "Testing";
        board.getDoneList().getTasks().add(doneTask);

        //Then
        Assert.assertEquals("Testing", board.getDoneList().getTasks().get(0));

        Assert.assertEquals(0,board.inProgressList.getTasks().size());

        Assert.assertEquals(0,board.getToDoList().getTasks().size());


    }
}
