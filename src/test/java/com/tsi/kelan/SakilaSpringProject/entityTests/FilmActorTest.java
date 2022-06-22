package com.tsi.kelan.SakilaSpringProject.entityTests;


import com.tsi.kelan.SakilaSpringProject.entities.Actor;
import com.tsi.kelan.SakilaSpringProject.entities.Film;
import com.tsi.kelan.SakilaSpringProject.entities.FilmActor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmActorTest {


    @Test
    public void testGettersAndSetters(){

        Actor testActor =new Actor(20,"John","Paul");
        Film testFilm =  new Film(2,"My New Solo Film","a trashy film about han solo", 2022,0, "null",3,2.99f,200,22.99f,"R","null","2022-02-15 15:03:42");

        FilmActor testFilmActor =new FilmActor();

        testFilmActor.setActor(testActor);
        testFilmActor.setFilm(testFilm);
        testFilmActor.setLastUpdate("2017-12-03 10:15:30");



        Assertions.assertEquals(testActor, testFilmActor.getActor());
        Assertions.assertEquals(testFilm, testFilmActor.getFilm());
        Assertions.assertEquals("2017-12-03 10:15:30", testFilmActor.getLastUpdate());




    }

//    @Test
//    public void testConstructor(){
//

}
