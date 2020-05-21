package com.kodilla.stream.world;

import com.kodilla.stream.sand.Asia;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.L;

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

        Country china = new Country("China", BigDecimal.valueOf(1438707163));
        Country india = new Country("India", BigDecimal.valueOf(1380004385));
        Country japan = new Country("Japan", BigDecimal.valueOf(126519062));
        Country russia = new Country("Russia", BigDecimal.valueOf(145927633));
        Country turkey = new Country("Turkey", BigDecimal.valueOf(84232553));

        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(japan);
        asia.addCountry(russia);
        asia.addCountry(turkey);


        BigDecimal totalPeople = world.getPeopleQuantity();
        //1438707163+1380004385+126519062+145927633+84232553 = ‭3,175,390,796‬

        BigDecimal expectedPeople = new BigDecimal("3175390796");
        Assert.assertEquals(expectedPeople, totalPeople);




    }
}
