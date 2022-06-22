//package com.tsi.kelan.SakilaSpringProject.mockito;
//
//
//import com.tsi.kelan.SakilaSpringProject.entities.Film;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//
//public class FilmTest {
//
//
//    @Test
//    public void testGettersAndSetters(){
//        Film testFilm =new Film();
//        testFilm.setFilm_id(1);
//        testFilm.setDescription("");
//
//        Assertions.assertEquals("Bondman", testActor.getFirst_name());
//        Assertions.assertEquals("Namdnob", testActor.getLast_name());
//        Assertions.assertEquals(9340, testActor.getActor_id());
//    }
//
//    @Test
//    public void testConstructor1(){
//        Actor liam = new Actor("Liam","Neeson");
//        Assertions.assertEquals("Liam",liam.getFirst_name());
//        Assertions.assertEquals("Neeson",liam.getLast_name());
//    }
//
//    @Test
//    public void testConstructor2(){
//        Actor mike = new Actor(2000,"Micheal","Stevens");
//        Assertions.assertEquals(2000,mike.getActor_id());
//        Assertions.assertEquals("Micheal",mike.getFirst_name());
//        Assertions.assertEquals("Stevens",mike.getLast_name());
//    }
//
//    @Test
//    public void testToString(){
//        Actor jen = new Actor("Jennifer","Connelly");
//        Assertions.assertEquals("Actor{first_name='Jennifer', last_name='Connelly'}",jen.toString());
//    }
//}
