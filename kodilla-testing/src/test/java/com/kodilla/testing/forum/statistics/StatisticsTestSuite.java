package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());

        CountStatistics countStatistics = new CountStatistics();
        countStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(0, countStatistics.getNumberOfPosts());
    }
/*
    @Test
    public void testStatisticsPostsEquals1000(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        CountStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(1000, countStatistics.getNumberOfPosts());

    }

    @Test
    public void testStatisticsCommentsEqualsZero(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        CountStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(0, countStatistics.getNumberOfComments());
    }

    @Test
    public void testStatisticsCommentsMoreThanPosts(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(3);
        CountStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(5, countStatistics.getNumberOfComments());
    }

    @Test
    public void testStatisticsCommentsLowerThanPosts(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(12);
        CountStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(5, countStatistics.getNumberOfComments());
    }

    @Test
    public void testStatisticsNumberOfUsersEqualsZero(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames().size()).thenReturn(0);
        CountStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(0, countStatistics.getNumberOfUsersUsers());
    }


    @Test
    public void testStatisticsNumberofUsersEquals100(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames().size()).thenReturn(100);
        CountStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(0, countStatistics.getNumberOfUsersUsers());
    }
*/
}
