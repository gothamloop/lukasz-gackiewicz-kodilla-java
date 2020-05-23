package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {


    private final List<Continent> listOfContinents = new ArrayList<>();


    public World() {
    }

    public List<Continent> getListOfContinents() {
        return listOfContinents;
    }

    public BigDecimal getPeopleQuantity() {

        BigDecimal peopleQuantityOnTheWorld = listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return peopleQuantityOnTheWorld;
    }

    public void addContinent(Continent continent) {
        listOfContinents.add(continent);
    }




}