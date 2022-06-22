package com.tsi.kelan.SakilaSpringProject.entityTests;


import com.tsi.kelan.SakilaSpringProject.entities.more.Address;
import com.tsi.kelan.SakilaSpringProject.entities.more.City;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AddressTest {


    @Test
    public void testGettersAndSetters(){
        Address testAddress =new Address();

        City testCity = new City();

        testAddress.setId(22);
        testAddress.setAddress("99 Bonneville Rd");
        testAddress.setAddress2(null);
        testAddress.setDistrict("Nottinghamshire");
        testAddress.setCity(testCity);
        testAddress.setPostalCode("NG11 2DY");
        testAddress.setPhone("078347830826");
        testAddress.setLastUpdate("2016-02-15 05:03:42");



        Assertions.assertEquals(22, testAddress.getId());
        Assertions.assertEquals("99 Bonneville Rd", testAddress.getAddress());
        Assertions.assertEquals(null, testAddress.getAddress2());
        Assertions.assertEquals("Nottinghamshire", testAddress.getDistrict());
        Assertions.assertEquals(testCity, testAddress.getCity());
        Assertions.assertEquals("NG11 2DY", testAddress.getPostalCode());
        Assertions.assertEquals("078347830826", testAddress.getPhone());
        Assertions.assertEquals("2016-02-15 05:03:42", testAddress.getLastUpdate());


    }

    @Test
    public void testConstructor(){
        City testCity = new City();
        Address testAddress = new Address(12,"333 Meriadoc Drive","22 Peregrin Boulevard", "Eastfarthing", testCity, "TS11 9QP", "01212649631","2016-02-15 05:03:42" );

        Assertions.assertEquals(12, testAddress.getId());
        Assertions.assertEquals("333 Meriadoc Drive", testAddress.getAddress());
        Assertions.assertEquals("22 Peregrin Boulevard", testAddress.getAddress2());
        Assertions.assertEquals("Eastfarthing", testAddress.getDistrict());
        Assertions.assertEquals(testCity, testAddress.getCity());
        Assertions.assertEquals("TS11 9QP", testAddress.getPostalCode());
        Assertions.assertEquals("01212649631", testAddress.getPhone());
        Assertions.assertEquals("2016-02-15 05:03:42", testAddress.getLastUpdate());
    }

}
