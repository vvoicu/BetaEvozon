package com.tests.newsleter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.steps.loginSteps;
//import com.steps.NewsletterSteps;
import com.steps.newsletter.NewsletterSteps;;


@RunWith(SerenityRunner.class)
public class SelectNewsletterTest {
	
	@Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://172.22.4.88:9090")
    public Pages pages;
    
    @Steps
    public NewsletterSteps newsletterSteps ;
    @Steps
    public loginSteps loginsteps;

    @Test
    public void selectNewsletter(){
    	loginsteps.is_the_home_page();
    	loginsteps.login_With("ana.stanca1", "test1");
    	newsletterSteps.clickNewsletter();
    	newsletterSteps.list();
    	newsletterSteps.clickNext();
    	newsletterSteps.list();
    	newsletterSteps.clickNext();
    	newsletterSteps.list();
    	newsletterSteps.clickNext();
    	newsletterSteps.list();
    }
}
