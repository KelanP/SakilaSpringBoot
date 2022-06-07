package com.tsi.kelan.FirstSpringProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
