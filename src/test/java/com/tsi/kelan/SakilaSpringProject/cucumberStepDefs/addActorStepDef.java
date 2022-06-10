package com.tsi.kelan.SakilaSpringProject.cucumberStepDefs;

import com.tsi.kelan.SakilaSpringProject.entities.Actor;
import com.tsi.kelan.SakilaSpringProject.repos.ActorRepository;
import com.tsi.kelan.SakilaSpringProject.SakilaSpringProjectApplication;
import com.tsi.kelan.SakilaSpringProject.repos.FilmActorRepository;
import com.tsi.kelan.SakilaSpringProject.repos.FilmRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class addActorStepDef {

    private Actor testActor;
    private ActorRepository actorRepository;
    private FilmRepository filmRepository;
    private FilmActorRepository filmactorRepository;

    SakilaSpringProjectApplication underTest = new SakilaSpringProjectApplication(actorRepository,filmRepository,filmactorRepository);


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