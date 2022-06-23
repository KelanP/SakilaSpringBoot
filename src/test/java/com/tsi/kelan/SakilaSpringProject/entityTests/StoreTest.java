package com.tsi.kelan.SakilaSpringProject.entityTests;


import com.tsi.kelan.SakilaSpringProject.entities.more.Address;
import com.tsi.kelan.SakilaSpringProject.entities.more.Staff;
import com.tsi.kelan.SakilaSpringProject.entities.more.Store;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;


public class StoreTest {


    @Test
    public void testGettersAndSetters(){
        Store testStore =new Store();
        Staff testManager = new Staff();
        Address testAddress = new Address();

        testStore.setId(2);
        testStore.setManagerStaff(testManager);
        testStore.setAddress(testAddress);
        testStore.setLastUpdate("2015-06-01 22:53:30");

        Assertions.assertEquals(2,testStore.getId());
        Assertions.assertEquals(testManager,testStore.getManagerStaff());
        Assertions.assertEquals(testAddress,testStore.getAddress());
        Assertions.assertEquals("2015-06-01 22:53:30",testStore.getLastUpdate());

    }

    @Test
    public void testConstructor(){
        Staff testManager2 = new Staff();
        Address testAddress2 = new Address();
        Store testStore =new Store(22,testManager2,testAddress2,"2012-06-01 22:53:30");


        Assertions.assertEquals(22,testStore.getId());
        Assertions.assertEquals(testManager2,testStore.getManagerStaff());
        Assertions.assertEquals(testAddress2,testStore.getAddress());
        Assertions.assertEquals("2012-06-01 22:53:30",testStore.getLastUpdate());

    }

}
