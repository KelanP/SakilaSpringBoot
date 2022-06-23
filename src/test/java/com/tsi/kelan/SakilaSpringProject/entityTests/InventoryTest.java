package com.tsi.kelan.SakilaSpringProject.entityTests;


import com.tsi.kelan.SakilaSpringProject.entities.Film;
import com.tsi.kelan.SakilaSpringProject.entities.more.Inventory;
import com.tsi.kelan.SakilaSpringProject.entities.more.Store;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class InventoryTest {


    @Test
    public void testGettersAndSetters(){
        Inventory testInventory =new Inventory();

        Store testStore= new Store();
        Film testFilm = new Film();


        testInventory.setId(222);
        testInventory.setFilm(testFilm);
        testInventory.setStore(testStore);
        testInventory.setLastUpdate("2016-02-15 05:03:42");


        Assertions.assertEquals(222,testInventory.getId());
        Assertions.assertEquals(testFilm,testInventory.getFilm());
        Assertions.assertEquals(testStore,testInventory.getStore());
        Assertions.assertEquals("2016-02-15 05:03:42",testInventory.getLastUpdate());


    }

    @Test
    public void testConstructor(){

        Store testStore3= new Store();
        Film testFilm3 = new Film();

        Inventory testInventory =new Inventory(2,testFilm3,testStore3,"2018-08-15 05:08:48");

        Assertions.assertEquals(2,testInventory.getId());
        Assertions.assertEquals(testFilm3,testInventory.getFilm());
        Assertions.assertEquals(testStore3,testInventory.getStore());
        Assertions.assertEquals("2018-08-15 05:08:48",testInventory.getLastUpdate());

    }


}
