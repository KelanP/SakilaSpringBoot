package com.tsi.kelan.SakilaSpringProject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class addActorStepDef {
    private ActorRepository actorRepository;
    private Actor testActor;
    private SakilaSpringProjectApplication underTest;
    @Given("I have the actor's details")
    public void i_have_the_actor_s_details() {
        Actor testActor = new Actor("John","Paul");

        throw new io.cucumber.java.PendingException();
    }
    @When("I input data into the database")
    public void i_input_data_into_the_database() {
        underTest.createNewActor(testActor);
        throw new io.cucumber.java.PendingException();
    }
    @Then("I get the success return string")
    public void i_get_the_success_return_string() {

        Assertions.assertEquals(testActor,underTest.createNewActor(testActor));
        throw new io.cucumber.java.PendingException();
    }
}
