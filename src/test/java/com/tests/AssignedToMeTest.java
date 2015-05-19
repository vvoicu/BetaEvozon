package com.tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.loginSteps;
import com.steps.vacation.*;

@RunWith(ThucydidesRunner.class)
public class AssignedToMeTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.4.88:9090/login")
	public Pages pages;
	
	@Steps
	public loginSteps evoportalLogIn;

	@Steps
    public AssignedToMeSteps assignedToMe;
	
	@Test
	public void login_and_verify_assignedToMe_table() {
		evoportalLogIn.is_the_home_page();
		evoportalLogIn.login_With("alexandra.pandele1", "evoportal");
		evoportalLogIn.selectVacation();
		assignedToMe.click_Inbox();
		assignedToMe.check_employeeName("Alexandra Pandele");
		assignedToMe.check_startDate();
		assignedToMe.check_endDate();
		assignedToMe.check_daysNumber();
		assignedToMe.check_type("Vacation Without Payment");
		
	
	}
	

}
