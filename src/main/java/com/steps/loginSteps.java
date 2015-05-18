package com.steps;

import com.pages.EvoportalPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class loginSteps extends ScenarioSteps {

    EvoportalPage loginPage;

    @Step
    public void enterUser(String user) {
        loginPage.enter_userName(user);
    }
    @Step
    public void enterPassword(String password){
    	loginPage.enter_password(password);
    }
    
    @Step
    public void loginButton() {
        loginPage.login();
    }

     @Step
    public void is_the_home_page() {
        loginPage.open();
    }

    @Step
    public void login_With(String user, String password) {
        enterUser(user);
        enterPassword(password);
        loginButton();
    }
    
    @Step
    public void  selectVacation(){
    	loginPage.selectVacation();
    }
}