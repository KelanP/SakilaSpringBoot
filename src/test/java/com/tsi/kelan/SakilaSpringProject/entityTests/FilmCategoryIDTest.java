package com.tsi.kelan.SakilaSpringProject.entityTests;


import com.tsi.kelan.SakilaSpringProject.entities.FilmCategoryId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmCategoryIDTest {


    @Test
    public void testGettersAndSetters(){
        FilmCategoryId testFilmCatID = new FilmCategoryId();

        testFilmCatID.setFilmId(22);
        testFilmCatID.setCategoryId(33);

        Assertions.assertEquals(22,testFilmCatID.getFilmId());
        Assertions.assertEquals(33,testFilmCatID.getCategoryId());

    }

    @Test
    public void equalsTest(){
        FilmCategoryId testCat = new FilmCategoryId();
        FilmCategoryId testCat2 = new FilmCategoryId();
        FilmCategoryId testCat3 = new FilmCategoryId(1,2);

        Assertions.assertTrue(testCat.equals(testCat2));
        Assertions.assertFalse(testCat.equals(testCat3));
        Assertions.assertFalse(testCat.equals(null));


    }

    @Test
    public void constructorTest(){
        FilmCategoryId testCon = new FilmCategoryId(2,23);
        Assertions.assertEquals(2,testCon.getFilmId());
        Assertions.assertEquals(23,testCon.getCategoryId());

    }



}
