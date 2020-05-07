package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

 //   testOddNumbersExterminatorEmptyList (sprawdzi, czy klasa zachowuje się poprawnie, gdy lista jest pusta)
 //   testOddNumbersExterminatorNormalList (sprawdzi, czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste)
 //   Użyj również adnotacji @Before oraz @After, aby wyświetlić informację o tym, jakie operacje (testy) są aktualnie wykonywane.

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
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

        @Test
        public void testOddNumbersExterminatorEmptyList () {

            ArrayList<Integer> emptyList = new ArrayList<>();
            ArrayList<Integer> numbersEven = OddNumbersExterminator.exterminate(emptyList);
            System.out.println("Test empty list");
            Assert.assertEquals(emptyList, numbersEven);
        }


        @Test
        public void testOddNumbersExterminatorNormalList () {
            ArrayList<Integer> normalList = new ArrayList<>();
            normalList.add(2);
            normalList.add(3);
            normalList.add(4);
            normalList.add(5);
            normalList.add(6);
            normalList.add(3);
            normalList.add(3);
            normalList.add(4);

            ArrayList<Integer> afterOnlyOddList = new ArrayList<>();
            afterOnlyOddList.add(2);
            afterOnlyOddList.add(4);
            afterOnlyOddList.add(6);
            afterOnlyOddList.add(4);

            ArrayList<Integer> numbersEven = OddNumbersExterminator.exterminate(normalList);
            System.out.println("Test NormalList");
            Assert.assertEquals(afterOnlyOddList, numbersEven);
        }

}
