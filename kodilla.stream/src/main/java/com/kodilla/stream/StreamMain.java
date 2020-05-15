package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import com.kodilla.stream.forumuser.ForumUser;




public class StreamMain {
    public static void main(String[] args) {
/*        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

          expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
          expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
          expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
          expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

          System.out.println("Calculating expressions with method references");
          expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
          expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
          expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
          expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String beautifulUpiekszacz1 = poemBeautifier.beautify("Beautiful text example no 1", (text -> text.toUpperCase()));
        System.out.println(beautifulUpiekszacz1);

        String beautifulUpiekszacz2 = poemBeautifier.beautify("BEAUTIFUL TEXT EXAMPLE NO 2", (text -> text.toLowerCase()));
        System.out.println(beautifulUpiekszacz2);

        String beautifulUpiekszacz3 = poemBeautifier.beautify("Beautiful text example no 3", (text -> "ABC" + text + "ABC"));
        System.out.println(beautifulUpiekszacz3);

        String beautifulUpiekszacz4 = poemBeautifier.beautify("Beautiful text example no 4", (text -> String.valueOf(text.replace(" ", "").length())));
        System.out.println(beautifulUpiekszacz4);


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


        People.getList().stream()
                .forEach(System.out::println);

        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);


        BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

*/
        Forum theForum = new Forum();

        Map<Integer, Forum> theResultMapOfUser = theForum.getUserList().stream()
                .filter(ourForum -> ourForum.getSex() == 'M')
                .filter(ourForum -> ourForum.getBirthDate().getYear() >= 2000)
                //.filter(ourForum -> ourForum.BirthDate.getYear() > 2000)
                .filter(ourForum -> ourForum.getQuantityOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUniqueID, ourForum -> ourForum));

        theResultMapOfUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

















    }
}