package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testAddCalculations() {
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Calculator calculator = context.getBean(Calculator.class);

            //When
            double result = calculator.add(4.5, 5.5);

            //Then
            Assert.assertEquals(10, result, 0.001);
    }

     @Test
     public void testSubCalculations() {
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Calculator calculator = context.getBean(Calculator.class);

            //When
            double result = calculator.sub(10.1, 6.1);

            //Then
            Assert.assertEquals(4.0, result, 0.001);
    }

    @Test
    public void testMulCalculations() {
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Calculator calculator = context.getBean(Calculator.class);

            //When
            double result = calculator.mul(3.3, 4.0);

            //Then
            Assert.assertEquals(13.2, result, 0.001);
    }

    @Test
    public void testDivNormalCalculations() {
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Calculator calculator = context.getBean(Calculator.class);

            //When
            double result = calculator.div(8.8, 8.0);

            //Then
            Assert.assertEquals(1.1, result, 0.001);
    }


}
