package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

class ShowAllFilms {
    public static void main(String[] args) {
        System.out.println("Showing all films:");
        //   System.out.println(MovieStore.getMovies());
        //   MovieStore.getMovies().entrySet().forEach(System.out::println);
        //   MovieStore.getMovies().entrySet().stream().forEach(e-> System.out.println(e));
        String allMovies = MovieStore.getMovies().entrySet()
                .stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(allMovies);
    }
}

