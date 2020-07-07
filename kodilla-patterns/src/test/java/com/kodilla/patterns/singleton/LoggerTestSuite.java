package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {

        //Given
        Logger loggerTest = Logger.getInstance();
        String log = "testing logging";

        //When
        loggerTest.log(log);

        //Then
        Assert.assertEquals(log, loggerTest.getLastLog());
    }


}
