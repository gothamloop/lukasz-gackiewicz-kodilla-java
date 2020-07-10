package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

        @Test
        public void testFactoryShoppingTask() {
            //Given
            TaskFactory factory = new TaskFactory();
            //When
            Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
            //Then
            Assert.assertEquals("Buy this", shoppingTask.getTaskName());

        }

        @Test
        public void testFactoryPaintingTask() {
            //Given
            TaskFactory factory = new TaskFactory();
            //When
            Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
            //Then
            Assert.assertEquals("Paint this", paintingTask.getTaskName());
        }

        @Test
        public void testFactoryRectangle() {
            //Given
            TaskFactory factory = new TaskFactory();
            //When
            Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
            //Then
            Assert.assertEquals("Drive there", drivingTask.getTaskName());
        }
}

