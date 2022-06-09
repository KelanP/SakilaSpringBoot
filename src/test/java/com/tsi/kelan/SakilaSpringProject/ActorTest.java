package com.tsi.kelan.SakilaSpringProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ActorTest {


    @Test
    public void testGettersAndSetters(){
        Actor testActor =new Actor();
        testActor.setFirst_name("Bondman");
        testActor.setLast_name("Namdnob");
        testActor.setActor_id(9340);
        Assertions.assertEquals("Bondman",testActor.getFirst_name());
        Assertions.assertEquals("Namdnob",testActor.getLast_name());
        Assertions.assertEquals(9340,testActor.getActor_id());
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
