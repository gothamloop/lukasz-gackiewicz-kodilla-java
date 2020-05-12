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

  /*  @Test
    public void testStatisticsPostsEqualsZero(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        CountStatistics.calculateAdvStatistics(statisticsMock);
        assertEquals(0, CountStatistics.getNumberOfPosts());
    }
*/
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
