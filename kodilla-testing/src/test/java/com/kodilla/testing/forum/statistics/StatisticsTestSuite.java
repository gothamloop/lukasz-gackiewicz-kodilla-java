package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testStatisticsPostsEquals1000(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        CountStatistics countStatistics = new CountStatistics();
        countStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(1000, countStatistics.getNumberOfPosts());

    }

    @Test
    public void testStatisticsCommentsEqualsZero(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        CountStatistics countStatistics = new CountStatistics();
        countStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(0, countStatistics.getNumberOfComments());
    }

    @Test
    public void testStatisticsCommentsMoreThanPosts(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(3);
        CountStatistics countStatistics = new CountStatistics();
        countStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(5, countStatistics.getNumberOfComments());
    }

    @Test
    public void testStatisticsCommentsLowerThanPosts(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(12);
        CountStatistics countStatistics = new CountStatistics();
        countStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(5, countStatistics.getNumberOfComments());
    }

    @Test
    public void testStatisticsNumberOfUsersEqualsZero(){
        List<String> tehListMock = new ArrayList<>();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(tehListMock);
        CountStatistics countStatistics = new CountStatistics();
        countStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(0, countStatistics.getNumberOfUsersUsers());
    }


    @Test
    public void testStatisticsNumberOfUsersEquals100() {
        List<String> theListMock = new ArrayList<>();
        for(int i=0 ; i<100 ; i++){
            theListMock.add("An user");}
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(theListMock);
        CountStatistics countStatistics = new CountStatistics();
        countStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(100, countStatistics.getNumberOfUsersUsers());
    }


}
