package com.tsi.kelan.SakilaSpringProject.mockito;

import com.tsi.kelan.SakilaSpringProject.entities.Customer;
import com.tsi.kelan.SakilaSpringProject.entities.notimportant.Address;
import com.tsi.kelan.SakilaSpringProject.entities.notimportant.Store;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;


public class CustomerTest {


    @Test
    public void testGettersAndSetters(){
        Customer testCustomer =new Customer();

        Store testStore= new Store();

        testCustomer.setId(222);
        testCustomer.setStore(testStore);
        testCustomer.setFirstName("Phillip");
        testCustomer.setLastName("Dick");
        testCustomer.setEmail("pdick@aol.com");
        testCustomer.setAddress(testCustomer.getAddress());
        testCustomer.setActive(true);
        testCustomer.setCreateDate("2020-01-01 01:10:01");
        testCustomer.setLastUpdate("2022-01-01 01:10:01");



        Assertions.assertEquals(222,testCustomer.getId());
        Assertions.assertEquals(testStore,testCustomer.getStore());
        Assertions.assertEquals("Phillip",testCustomer.getFirstName());
        Assertions.assertEquals("Dick",testCustomer.getLastName());
        Assertions.assertEquals("pdick@aol.com",testCustomer.getEmail());
        Assertions.assertEquals(null,testCustomer.getAddress());
        Assertions.assertEquals(true,testCustomer.getActive());
        Assertions.assertEquals("2020-01-01 01:10:01",testCustomer.getCreateDate());
        Assertions.assertEquals("2022-01-01 01:10:01",testCustomer.getLastUpdate());



    }

    @Test
    public void testConstructor(){

        Store testStore= new Store();
        Address testAddress = new Address();

        Customer liam = new Customer(2222,testStore,"Liam","Neeson","LNeeson@mail.com",testAddress,false,"2020-10-11 11:10:01","2021-01-01 01:10:02");
        Assertions.assertEquals(2222,liam.getId());
        Assertions.assertEquals(testStore,liam.getStore());
        Assertions.assertEquals("Liam",liam.getFirstName());
        Assertions.assertEquals("Neeson",liam.getLastName());
        Assertions.assertEquals("LNeeson@mail.com",liam.getEmail());
        Assertions.assertEquals(testAddress,liam.getAddress());
        Assertions.assertEquals(false,liam.getActive());
        Assertions.assertEquals("2020-10-11 11:10:01",liam.getCreateDate());
        Assertions.assertEquals("2021-01-01 01:10:02",liam.getLastUpdate());
    }


}
