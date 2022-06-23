package com.tsi.kelan.SakilaSpringProject.entityTests;



import com.tsi.kelan.SakilaSpringProject.entities.more.City;
import com.tsi.kelan.SakilaSpringProject.entities.more.Country;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CityTest {


    @Test
    public void testGettersAndSetters(){

        City testCity = new City();
        Country testCountry = new Country();

        testCity.setId(22);
        testCity.setCity("Vatican City");
        testCity.setCountry(testCountry);
        testCity.setLastUpdate("2016-02-15 05:03:42");

        Assertions.assertEquals(22, testCity.getId());
        Assertions.assertEquals("Vatican City", testCity.getCity());
        Assertions.assertEquals(testCountry, testCity.getCountry());
        Assertions.assertEquals("2016-02-15 05:03:42", testCity.getLastUpdate());


    }

    @Test
    public void testConstructor(){
        Country testCountry2 = new Country();
        City testCity = new City(23,"Leicester",testCountry2,"2018-02-15 08:03:42");


        Assertions.assertEquals(testCountry2, testCity.getCountry());
        Assertions.assertEquals(23, testCity.getId());
        Assertions.assertEquals("Leicester", testCity.getCity());
        Assertions.assertEquals("2018-02-15 08:03:42", testCity.getLastUpdate());
    }

}
