package com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/login")
public class EvoportalPage extends PageObject {

    @FindBy(id="_58_login")
    private WebElementFacade userName;
    
    @FindBy(id="_58_password")
    private WebElementFacade userPassword;

    @FindBy(css="[type='submit']")
    private WebElementFacade signInButton;
    
    @FindBy(css="a[href='http://172.22.4.88:9090/vacation']")
    private WebElementFacade Vacations; 
    
    public void enter_userName(String user){
    	userName.type(user);
    }
    public void enter_password(String password){
    	
    	userPassword.type(password);
    }

    public void login() {
        signInButton.click();
    }
    
    public void selectVacation(){
    	element(Vacations).waitUntilVisible();
    	Vacations.click();
    	
    }
}
