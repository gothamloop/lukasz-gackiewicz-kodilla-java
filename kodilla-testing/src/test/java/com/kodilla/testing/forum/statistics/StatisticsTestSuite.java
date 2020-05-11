package com.kodilla.testing.forum.statistics;

import org.junit.*;

public class StatisticsTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() { System.out.println("Test Suite: end");}

    @Test
    public void testStatisticsPostsEqualsZero(){

    }

    @Test
    public void testStatisticsPostsEquals1000(){

    }

    @Test
    public void testStatisticsCommentsEqualsZero(){

    }

    @Test
    public void testStatisticsCommentsMoreThanPosts(){

    }

    @Test
    public void testStatisticsCommentsLowerThanPosts(){

    }

    @Test
    public void testStatisticsNumberofUsersEqualsZero(){

    }


    @Test
    public void testStatisticsNumberofUsersEquals100(){

    }




}
