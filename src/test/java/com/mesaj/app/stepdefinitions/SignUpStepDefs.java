package com.mesaj.app.stepdefinitions;

import com.mesaj.app.conf.DriverConfig;
import com.mesaj.app.pageobjects.SignUpServices;
import com.mesaj.app.util.RandomNumberGenerator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {DriverConfig.class})
public class SignUpStepDefs {

    @Autowired
    private SignUpServices signUpServices;

    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() throws InterruptedException {

        signUpServices.go("http://demo.automationtesting.in/Register.html");
        signUpServices.writeFirstName("Pepito");
        signUpServices.writeLastName("Perez");
        signUpServices.writeEmail("Perez@gmail.com");
        signUpServices.selectMale();
        // signUpServices.selectCountry("Colombia");
        signUpServices.selectBirthDay("10");
        signUpServices.selectBirthMonth("February");
        signUpServices.selectBirthYear("1989");
        signUpServices.writePhone(RandomNumberGenerator.get());
        signUpServices.writePassword("A_x?a1989");
        signUpServices.writeConfirmPassword("A_x?a1989");

        signUpServices.clickOnSubmit();

        Thread.sleep(8000);

    }

    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() {
    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {
    }

}
