package com.tsi.kelan.FirstSpringProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {


    @Test
    public void testGettersandSetters(){
        Actor testActor =new Actor();
        testActor.setFirst_name("Bondman");
        testActor.setLast_name("Namdnob");
        Assertions.assertEquals("Bondman",testActor.getFirst_name());
        Assertions.assertEquals("Namdnob",testActor.getLast_name());
    }
}
