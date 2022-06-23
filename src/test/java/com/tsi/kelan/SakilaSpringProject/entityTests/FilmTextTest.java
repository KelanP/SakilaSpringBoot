package com.tsi.kelan.SakilaSpringProject.entityTests;


import com.tsi.kelan.SakilaSpringProject.entities.more.FilmText;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmTextTest {


    @Test
    public void testGettersAndSetters(){
        FilmText testFilmText =new FilmText();

       testFilmText.setId(2);
       testFilmText.setTitle("THE BERNSTEIN BEARS");
       testFilmText.setDescription("Some big bears brutalise bullies in the bank");


       Assertions.assertEquals(2,testFilmText.getId());
       Assertions.assertEquals("THE BERNSTEIN BEARS",testFilmText.getTitle());
       Assertions.assertEquals("Some big bears brutalise bullies in the bank",testFilmText.getDescription());


    }

    @Test
    public void testConstructor(){
        FilmText testFilmText =new FilmText(3,"PORKY'S","Wild high school kids get up to some antics");



        Assertions.assertEquals(3,testFilmText.getId());
        Assertions.assertEquals("PORKY'S",testFilmText.getTitle());
        Assertions.assertEquals("Wild high school kids get up to some antics",testFilmText.getDescription());


    }

}
