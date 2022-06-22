package com.tsi.kelan.SakilaSpringProject.mockito;

import com.tsi.kelan.SakilaSpringProject.entities.Actor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;


public class ActorTest {


    @Test
    public void testGettersAndSetters(){
        Actor testActor =new Actor();
        testActor.setFirst_name("Bondman");
        testActor.setLast_name("Namdnob");
        testActor.setActor_id(9340);
        testActor.setLastUpdate(Instant.parse("1970-01-01T00:00:00Z"));
        Assertions.assertEquals("Bondman", testActor.getFirst_name());
        Assertions.assertEquals("Namdnob", testActor.getLast_name());
        Assertions.assertEquals(9340, testActor.getActor_id());
        Assertions.assertEquals(Instant.parse("1970-01-01T00:00:00Z"),testActor.getLastUpdate());
    }

    @Test
    public void testConstructor1(){
        Actor liam = new Actor("Liam","Neeson");
        Assertions.assertEquals("Liam",liam.getFirst_name());
        Assertions.assertEquals("Neeson",liam.getLast_name());
    }

    @Test
    public void testConstructor2(){
        Actor mike = new Actor(2000,"Micheal","Stevens");
        Assertions.assertEquals(2000,mike.getActor_id());
        Assertions.assertEquals("Micheal",mike.getFirst_name());
        Assertions.assertEquals("Stevens",mike.getLast_name());
    }

    @Test
    public void testToString(){
        Actor jen = new Actor("Jennifer","Connelly");
        Assertions.assertEquals("Actor{first_name='Jennifer', last_name='Connelly'}",jen.toString());
    }
}
