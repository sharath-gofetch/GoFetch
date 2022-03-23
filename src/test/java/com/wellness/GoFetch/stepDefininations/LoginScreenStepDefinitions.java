package com.wellness.GoFetch.stepDefininations;

import com.wellness.GoFetch.pageobject.LoginScreenPageObj;
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
}
