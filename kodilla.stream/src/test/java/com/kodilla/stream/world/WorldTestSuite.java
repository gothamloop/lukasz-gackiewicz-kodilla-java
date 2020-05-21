package com.kodilla.stream.world;

import com.kodilla.stream.sand.Asia;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        World world = new World();
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        Continent north_america = new Continent("North America");
        Continent south_america = new Continent("South America");
        Continent antarctica = new Continent("Antarctica");
        Continent europa = new Continent("Europa");
        Continent australia = new Continent("Australia");

        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(north_america);
        world.addContinent(south_america);
        world.addContinent(antarctica);
        world.addContinent(europa);
        world.addContinent(australia);

        Country china = new Country("China",1438707163);
        Country india = new Country("India",1380004385);

        asia.addCountry(china);
        asia.addCountry(india);











    }
}
