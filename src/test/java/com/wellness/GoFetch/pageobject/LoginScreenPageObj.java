package com.wellness.GoFetch.pageobject;

import com.wellness.utilities.DriverManager;
import com.wellness.utilities.MobileUtilities;
import com.wellness.utilities.SeleniumUtilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginScreenPageObj {

    @FindBy(id = "Login")
    private MobileElement loginBtn;
    @FindBy(id = "EmailInput")
    private MobileElement emailInput;
    @FindBy(id = "PasswordInput")
    private MobileElement passwordInput;
    @FindBy(id = "SignInButton")
    private MobileElement signInBtn;
    @FindBy (name = "Welcome Back")
    private MobileElement title;



    public LoginScreenPageObj() {

        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getIosDriver(), Duration.ofSeconds(10)), this);
    }

    public void clickOnLoginBtn(){
        MobileUtilities.click(loginBtn);
    }

    public void loginIntoGoFetch(String username, String password){
        MobileUtilities.setText(emailInput,username);
        MobileUtilities.click(title);
        MobileUtilities.setText(passwordInput,password);
        MobileUtilities.click(signInBtn);
    }

}
