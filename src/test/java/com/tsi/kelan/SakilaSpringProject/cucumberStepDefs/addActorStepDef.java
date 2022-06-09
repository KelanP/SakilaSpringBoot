package com.tsi.kelan.SakilaSpringProject.cucumberStepDefs;

import com.tsi.kelan.SakilaSpringProject.Actor;
import com.tsi.kelan.SakilaSpringProject.ActorRepository;
import com.tsi.kelan.SakilaSpringProject.SakilaSpringProjectApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class addActorStepDef {

    private Actor testActor;
    private ActorRepository actorRepository;

    SakilaSpringProjectApplication underTest = new SakilaSpringProjectApplication(actorRepository);


    @Given("I have the actor's details")
    public void i_have_the_actor_s_details() {
        testActor = new Actor("John","Paul");

    }
    @When("I input data into the database")
    public void i_input_data_into_the_database() {

        underTest.createNewActor(testActor);

    }

    @Then("I get the success return string")
    public void i_get_the_success_return_string() {

        Assertions.assertEquals(testActor,
                underTest.createNewActor(testActor));

    }
}
