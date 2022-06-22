package com.tsi.kelan.SakilaSpringProject.entityTests;


import com.tsi.kelan.SakilaSpringProject.entities.Film;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmTest {


    @Test
    public void testGettersAndSetters(){
        Film testFilm =new Film();

        testFilm.setFilm_id(1);
        testFilm.setDescription("A wonderful movie");
        testFilm.setLength(900);
        testFilm.setLanguage_id(1);
        testFilm.setLast_update("2006-02-15 05:03:42");
        testFilm.setOriginal_language_id("null");
        testFilm.setRelease_year(2020);
        testFilm.setRental_duration(4);
        testFilm.setRental_rate(6.79f);
        testFilm.setReplacement_cost(100);
        testFilm.setRating("PG");
        testFilm.setSpecial_features("Deleted Scenes");
        testFilm.setTitle("Big Bond");

        Assertions.assertEquals(1, testFilm.getFilm_id());
        Assertions.assertEquals("A wonderful movie", testFilm.getDescription());
        Assertions.assertEquals(900, testFilm.getLength());
        Assertions.assertEquals(1, testFilm.getLanguage_id());
        Assertions.assertEquals("2006-02-15 05:03:42", testFilm.getLast_update());
        Assertions.assertEquals("null", testFilm.getOriginal_language_id());
        Assertions.assertEquals(2020, testFilm.getRelease_year());
        Assertions.assertEquals(4, testFilm.getRental_duration());
        Assertions.assertEquals(6.79f, testFilm.getRental_rate());
        Assertions.assertEquals(100, testFilm.getReplacement_cost());
        Assertions.assertEquals("PG", testFilm.getRating());
        Assertions.assertEquals("Deleted Scenes", testFilm.getSpecial_features());
        Assertions.assertEquals("Big Bond", testFilm.getTitle());

    }

    @Test
    public void testConstructor(){
        Film film = new Film(2,"My New Solo Film","a trashy film about han solo", 2022,0, "null",3,2.99f,200,22.99f,"R","null","2022-02-15 15:03:42");

        Assertions.assertEquals(2, film.getFilm_id());
        Assertions.assertEquals("a trashy film about han solo", film.getDescription());
        Assertions.assertEquals(200, film.getLength());
        Assertions.assertEquals(0, film.getLanguage_id());
        Assertions.assertEquals("2022-02-15 15:03:42", film.getLast_update());
        Assertions.assertEquals("null", film.getOriginal_language_id());
        Assertions.assertEquals(2022, film.getRelease_year());
        Assertions.assertEquals(3, film.getRental_duration());
        Assertions.assertEquals(2.99f, film.getRental_rate());
        Assertions.assertEquals(22.99f, film.getReplacement_cost());
        Assertions.assertEquals("R", film.getRating());
        Assertions.assertEquals("null", film.getSpecial_features());
        Assertions.assertEquals("My New Solo Film", film.getTitle());
    }

}
