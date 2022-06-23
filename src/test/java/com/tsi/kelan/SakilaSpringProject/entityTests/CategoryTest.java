package com.tsi.kelan.SakilaSpringProject.entityTests;

import com.tsi.kelan.SakilaSpringProject.entities.Category;
import com.tsi.kelan.SakilaSpringProject.entities.FilmCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Set;


public class CategoryTest {


    @Test
    public void testGettersAndSetters(){
        Category testCategory =new Category();

        FilmCategory testFilmCat = new FilmCategory();

        testCategory.setId(2);
        testCategory.setName("Horror");
        testCategory.setLastUpdate("2019-02-15 05:03:42");
        //testCategory.setFilmCategories();

        Assertions.assertEquals(2,testCategory.getId());
        Assertions.assertEquals("Horror",testCategory.getName());
        Assertions.assertEquals("2019-02-15 05:03:42",testCategory.getLastUpdate());
       // Assertions.assertEquals((Set<FilmCategory>) testFilmCat,testCategory.getFilmCategories());

    }

    @Test
    public void testConstructor(){
        Category testCategoryCon =new Category(5,"Comedy","2020-02-15 05:03:42");

        Assertions.assertEquals(5,testCategoryCon.getId());
        Assertions.assertEquals("Comedy",testCategoryCon.getName());
        Assertions.assertEquals("2020-02-15 05:03:42",testCategoryCon.getLastUpdate());


    }

}
