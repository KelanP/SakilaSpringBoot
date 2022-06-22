package com.tsi.kelan.SakilaSpringProject.cucumber.cucumberStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.HttpURLConnection;


public class GetActorsStepDef {
    HttpURLConnection conn;
    @Given("The server has started")
    public void the_server_has_started() {

    }
    @When("I send a request")
    public void i_send_a_request() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I get back the JSON of actors")
    public void i_get_back_the_json_of_actors() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
