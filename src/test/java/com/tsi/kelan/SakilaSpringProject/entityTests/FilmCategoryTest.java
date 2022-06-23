package com.tsi.kelan.SakilaSpringProject.entityTests;


import com.tsi.kelan.SakilaSpringProject.entities.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmCategoryTest {


    @Test
    public void testGettersAndSetters(){

        FilmCategory testFilmCat = new FilmCategory();

        FilmCategoryId testFilmCatId = new FilmCategoryId();
        Film testFilm =new Film();
        Category testCategory = new Category();

        testFilmCat.setId(testFilmCatId);
        testFilmCat.setFilm(testFilm);
        testFilmCat.setCategory(testCategory);
        testFilmCat.setLastUpdate("2017-12-03 10:15:30");


        Assertions.assertEquals(testFilmCatId, testFilmCat.getId());
        Assertions.assertEquals(testFilm, testFilmCat.getFilm());
        Assertions.assertEquals(testCategory, testFilmCat.getCategory());
        Assertions.assertEquals("2017-12-03 10:15:30", testFilmCat.getLastUpdate());





    }

    @Test
    public void testConstructor() {

        FilmCategoryId testFilmCatId = new FilmCategoryId();
        Film testFilm =new Film();
        Category testCategory = new Category();


        FilmCategory testFilmCat = new FilmCategory(testFilmCatId,testFilm,testCategory,"2020-12-03 10:15:30");

        Assertions.assertEquals(testFilmCatId, testFilmCat.getId());
        Assertions.assertEquals(testFilm, testFilmCat.getFilm());
        Assertions.assertEquals(testCategory, testFilmCat.getCategory());
        Assertions.assertEquals("2020-12-03 10:15:30", testFilmCat.getLastUpdate());

    }




}
