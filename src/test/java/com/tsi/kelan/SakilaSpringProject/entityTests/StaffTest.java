package com.tsi.kelan.SakilaSpringProject.entityTests;



import com.tsi.kelan.SakilaSpringProject.entities.more.Address;
import com.tsi.kelan.SakilaSpringProject.entities.more.Staff;
import com.tsi.kelan.SakilaSpringProject.entities.more.Store;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StaffTest {


    @Test
    public void testGettersAndSetters(){
        Staff testStaff =new Staff();

        Address testAddress=new Address();
        Store testStore=new Store();

        testStaff.setId(22);
        testStaff.setFirstName("Micheal");
        testStaff.setLastName("Rogers");
        testStaff.setAddress(testAddress);
        testStaff.setPicture(null);
        testStaff.setEmail("MJRogers@aol.com");
        testStaff.setStore(testStore);
        testStaff.setActive(false);
        testStaff.setUsername("MichealR");
        testStaff.setPassword("mommy1");
        testStaff.setLastUpdate("2016-02-15 05:03:42");


        Assertions.assertEquals(22, testStaff.getId());
        Assertions.assertEquals("Micheal",testStaff.getFirstName());
        Assertions.assertEquals("Rogers",testStaff.getLastName());
        Assertions.assertEquals(testAddress,testStaff.getAddress());
        Assertions.assertEquals(null,testStaff.getPicture());
        Assertions.assertEquals("MJRogers@aol.com",testStaff.getEmail());
        Assertions.assertEquals(testStore,testStaff.getStore());
        Assertions.assertEquals(false,testStaff.getActive());
        Assertions.assertEquals("MichealR",testStaff.getUsername());
        Assertions.assertEquals("mommy1",testStaff.getPassword());
        Assertions.assertEquals("2016-02-15 05:03:42",testStaff.getLastUpdate());



    }

    @Test
    public void testConstructor(){


        Address testAddress=new Address();
        Store testStore=new Store();

        Staff testStaff =new Staff(33,"John","Richardson",testAddress,null,"jrichardson@gmail.com",testStore,true,"JRSon","password666","2016-02-15 05:03:43");

        Assertions.assertEquals(33, testStaff.getId());
        Assertions.assertEquals("John",testStaff.getFirstName());
        Assertions.assertEquals("Richardson",testStaff.getLastName());
        Assertions.assertEquals(testAddress,testStaff.getAddress());
        Assertions.assertEquals(null,testStaff.getPicture());
        Assertions.assertEquals("jrichardson@gmail.com",testStaff.getEmail());
        Assertions.assertEquals(testStore,testStaff.getStore());
        Assertions.assertEquals(true,testStaff.getActive());
        Assertions.assertEquals("JRSon",testStaff.getUsername());
        Assertions.assertEquals("password666",testStaff.getPassword());
        Assertions.assertEquals("2016-02-15 05:03:43",testStaff.getLastUpdate());

    }

}
