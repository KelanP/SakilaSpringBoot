package com.tsi.kelan.SakilaSpringProject.entityTests;


import com.tsi.kelan.SakilaSpringProject.entities.Language;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;


public class LanguageTest {


    @Test
    public void testGettersAndSetters(){
        Language testLanguage = new Language();
        testLanguage.setId(10);
        testLanguage.setName("Esperanto");
        testLanguage.setLastUpdate("2016-02-15 05:03:42");

        Assertions.assertEquals(10,testLanguage.getId());
        Assertions.assertEquals("Esperanto",testLanguage.getName());
        Assertions.assertEquals("2016-02-15 05:03:42",testLanguage.getLastUpdate());

    }

    @Test
    public void testConstructor1(){
        Language testLanguage = new Language(11,"Arabic","2018-02-15 05:03:42");;

        Assertions.assertEquals(11,testLanguage.getId());
        Assertions.assertEquals("Arabic",testLanguage.getName());
        Assertions.assertEquals("2018-02-15 05:03:42",testLanguage.getLastUpdate());

    }


}
