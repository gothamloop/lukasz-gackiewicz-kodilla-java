package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String taskToDo = "testing taskToDo";

        String taskInProgress = "testing taskInProgress";

        String taskDone = "testing taskDone";

        board.getToDoList().addTask(taskToDo);
        board.getInProgressList().addTask(taskInProgress);
        board.getDoneList().addTask(taskDone);

        //Then
        Assert.assertEquals("testing taskToDo", board.getToDoList().getTasks().get(0));

        Assert.assertEquals("testing taskInProgress", board.getInProgressList().getTasks().get(0));

        Assert.assertEquals("testing taskDone", board.getDoneList().getTasks().get(0));
    }
}