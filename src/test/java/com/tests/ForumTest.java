package com.tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.ForumSteps;
import com.steps.loginSteps;

@RunWith(ThucydidesRunner.class)
public class ForumTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	// @ManagedPages(defaultUrl = "http://172.22.4.88:9090/login")
	public Pages pages;

    @Steps
    public loginSteps endUser;
    
    @Steps
    public ForumSteps forumSteps;
    
	@Test
	public void login_with_user_ramonaZmole1() {
		endUser.is_the_home_page();
		endUser.login_With("mihai.mindrutescu1", "12345");
		forumSteps.clickForumButton();
		forumSteps.CheckSumOfTotalAvailableFreeDaysLeft();
		
	}
		
}
