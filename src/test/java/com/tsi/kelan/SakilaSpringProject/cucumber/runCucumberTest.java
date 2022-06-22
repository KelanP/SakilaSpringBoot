package com.tsi.kelan.SakilaSpringProject.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(plugin = {"pretty"},
            features = "src/test/resources/Cucumber",
            glue= "com.tsi.kelan.SakilaSpringProject")

    public class runCucumberTest{

}
