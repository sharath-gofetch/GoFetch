package com.wellness.GoFetch.stepDefininations;

import com.wellness.GoFetch.pageobject.LoginScreenPageObj;
import com.wellness.utilities.MobileUtilities;
import io.cucumber.java.en.*;

public class LoginScreenStepDefinitions {

    public LoginScreenPageObj loginScreenPageObj;

    public LoginScreenStepDefinitions() {
        loginScreenPageObj = new LoginScreenPageObj();
    }

    @Given("^User click on the login button$")
    public void user_click_on_the_login_button() {
        loginScreenPageObj.clickOnLoginBtn();
    }

    @Then("^User enter the  username \"([^\"]*)\" and password \"([^\"]*)\" and click on the login button$")
    public void user_enter_the_username_something_and_password_something(String username, String password) {
        loginScreenPageObj.loginIntoGoFetch(username, password);

    }

    @Then("^User select the Clinic$")
    public void user_select_the_clinic()  {
    }

    @Then("^Enter the phone number \"([^\"]*)\"$")
    public void enter_the_phone_number_something(String phoneNumber) {

    }

    @Then("^Choose a pet$")
    public void choose_a_pet()  {
    }

    @Then("^Select the payment plan \"([^\"]*)\", enter payment details ccNumber \"([^\"]*)\", expiry \"([^\"]*)\", cvv \"([^\"]*)\", zipcode\"([^\"]*)\" and click on pay$")
    public void select_the_payment_plan_something_enter_payment_details_ccnumber_something_expiry_something_cvv_something_zipcodesomething_and_click_on_pay(String paymentPlan, String ccNumber, String expiryDate, String cvv, String zipcode)  {

    }

}
