package com.tests;

import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.loginSteps;
import com.steps.vacation.*;

@RunWith(ThucydidesRunner.class)
public class loginPageTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	// @ManagedPages(defaultUrl = "http://172.22.4.88:9090/login")
	public Pages pages;

    @Steps
    public loginSteps endUser;
    
    @Steps
    public myRequestsSteps myRequestsSteps;
    
	@Issue("#WIKI-1")
	@Test
	public void login_with_user_ramonaZmole1() {
		endUser.is_the_home_page();
		endUser.login_With("ramonazmole1", "ramona1");
		
	}
		
}
