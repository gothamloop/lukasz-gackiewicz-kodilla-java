package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.Assert;
import org.junit.Test;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("A local library");
        Book book_1 = new Book("A book number 1", "Author 1", 1990,4,23);
        Book book_2 = new Book("A book number 2", "Author 2", 1992,12,2);
        library.getBooks().add(book_1);
        library.getBooks().add(book_2);

        //making a shallow copy of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("shallowCopy of Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("deepCopy of Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //When
        library.getBooks().remove(book_1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(1,library.getBooks().size());
        Assert.assertEquals(1,clonedLibrary.getBooks().size());
        Assert.assertEquals(2,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(),library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(),library.getBooks());

    }
}
