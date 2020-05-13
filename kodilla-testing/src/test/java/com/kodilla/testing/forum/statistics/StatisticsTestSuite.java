package com.kodilla.testing.forum.statistics;

import org.junit.*;

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
        CountStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(0, CountStatistics.getNumberOfPosts());
    }

    @Test
    public void testStatisticsPostsEquals1000(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        CountStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(1000, CountStatistics.postsCount());

    }

    @Test
    public void testStatisticsCommentsEqualsZero(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        assertEquals(0, CountStatistics.commentsCount());
    }

    @Test
    public void testStatisticsCommentsMoreThanPosts(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(3);
        assertEquals(5, CountStatistics.commentsCount());
    }

    @Test
    public void testStatisticsCommentsLowerThanPosts(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(12);
        assertEquals(5, CountStatistics.commentsCount());
    }

    @Test
    public void testStatisticsNumberOfUsersEqualsZero(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames().size()).thenReturn(0);
        CountStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(0, CountStatistics.statistics.usersNames().size());
    }


    @Test
    public void testStatisticsNumberofUsersEquals100(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames().size()).thenReturn(100);
        CountStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(0, CountStatistics.statistics.usersNames().size());
    }




}
