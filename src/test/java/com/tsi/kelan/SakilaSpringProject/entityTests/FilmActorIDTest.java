package com.tsi.kelan.SakilaSpringProject.entityTests;


import com.tsi.kelan.SakilaSpringProject.entities.Film;
import com.tsi.kelan.SakilaSpringProject.entities.FilmActorId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmActorIDTest {


    @Test
    public void testGettersAndSetters(){
        FilmActorId test = new FilmActorId();

        test.setActorId(1);

        test.setFilmId(3);

        Assertions.assertEquals(1,test.getActorId());
        Assertions.assertEquals(3,test.getFilmId());

    }

    @Test
    public void equalsTest(){
        FilmActorId testFilmActorID = new FilmActorId();
        FilmActorId testFilmActorID2 = new FilmActorId();
        FilmActorId testFilmActorID3 = new FilmActorId(1,1);

        Assertions.assertTrue(testFilmActorID.equals(testFilmActorID2));
        Assertions.assertFalse(testFilmActorID.equals(testFilmActorID3));


    }

    @Test
    public void constructorTest(){
        FilmActorId testCon = new FilmActorId(2,23);
        Assertions.assertEquals(2,testCon.getActorId());
        Assertions.assertEquals(23,testCon.getFilmId());

    }



}
