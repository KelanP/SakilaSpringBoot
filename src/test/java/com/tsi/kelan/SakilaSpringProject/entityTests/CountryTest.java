package com.tsi.kelan.SakilaSpringProject.entityTests;

import com.tsi.kelan.SakilaSpringProject.entities.more.Country;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CountryTest {


    @Test
    public void testGettersAndSetters(){

        Country testCountry = new Country();

        testCountry.setId(22);
        testCountry.setCountry("Liberia");
        testCountry.setLastUpdate("2020-12-15 15:03:42");

        Assertions.assertEquals(22, testCountry.getId());
        Assertions.assertEquals("Liberia", testCountry.getCountry());
        Assertions.assertEquals("2020-12-15 15:03:42", testCountry.getLastUpdate());

    }

    @Test
    public void testConstructor(){
        Country testCountry2 = new Country(1000,"Sierra Leone","2021-12-15 15:03:42");


        Assertions.assertEquals(1000, testCountry2.getId());
        Assertions.assertEquals("Sierra Leone", testCountry2.getCountry());
        Assertions.assertEquals("2021-12-15 15:03:42", testCountry2.getLastUpdate());

    }

}
