package com.kodilla.patterns2.adapter.bookclasifier;


import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){

        //GIVEN
        MedianAdapter medianAdapter = new MedianAdapter();
        Book book1 = new Book("a", "a", 1, "abc");
        Book book2 = new Book("b", "b", 2, "def");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);

        //WHEN
        int median = medianAdapter.publicationYearMedian(books);

        //THEN
        System.out.println(median);
        assertEquals(2, median);
    }
}