package com.tsi.kelan.SakilaSpringProject.entityTests;


import com.tsi.kelan.SakilaSpringProject.entities.Customer;
import com.tsi.kelan.SakilaSpringProject.entities.more.Inventory;
import com.tsi.kelan.SakilaSpringProject.entities.more.Rental;

import com.tsi.kelan.SakilaSpringProject.entities.more.Staff;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RentalTest {


    @Test
    public void testGettersAndSetters(){
        Rental testRental =new Rental();

        Inventory testInventory = new Inventory();
        Customer testCustomer = new Customer();
        Staff testStaff = new Staff();

        testRental.setId(301);
        testRental.setRentalDate("2015-05-24 22:53:30");
        testRental.setInventory(testInventory);
        testRental.setCustomer(testCustomer);
        testRental.setReturnDate("2015-06-01 22:53:30");
        testRental.setStaff(testStaff);
        testRental.setLastUpdate("2015-06-01 20:53:30");


        Assertions.assertEquals(301, testRental.getId());
        Assertions.assertEquals("2015-05-24 22:53:30", testRental.getRentalDate());
        Assertions.assertEquals(testInventory, testRental.getInventory());
        Assertions.assertEquals(testCustomer, testRental.getCustomer());
        Assertions.assertEquals("2015-06-01 22:53:30", testRental.getReturnDate());
        Assertions.assertEquals(testStaff, testRental.getStaff());
        Assertions.assertEquals("2015-06-01 20:53:30", testRental.getLastUpdate());

    }

    @Test
    public void testConstructor(){


        Inventory testInventory = new Inventory();
        Customer testCustomer = new Customer();
        Staff testStaff = new Staff();

        Rental testRental =new Rental(301,"2015-05-24 22:53:30",testInventory,testCustomer,"2015-06-01 22:53:30",testStaff,"2015-06-01 20:53:30");

        Assertions.assertEquals(301, testRental.getId());
        Assertions.assertEquals("2015-05-24 22:53:30", testRental.getRentalDate());
        Assertions.assertEquals(testInventory, testRental.getInventory());
        Assertions.assertEquals(testCustomer, testRental.getCustomer());
        Assertions.assertEquals("2015-06-01 22:53:30", testRental.getReturnDate());
        Assertions.assertEquals(testStaff, testRental.getStaff());
        Assertions.assertEquals("2015-06-01 20:53:30", testRental.getLastUpdate());
    }

}
