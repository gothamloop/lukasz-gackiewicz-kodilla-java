package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {


    private final List<Country> listOfCountries = new ArrayList<>();
    private final String nameOfContinent;


    public Continent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public void addCountry(Country country) {
    }
}
