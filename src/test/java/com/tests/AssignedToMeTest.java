package com.tests;

import java.util.ArrayList;
import java.util.List;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.vacation.AssignedToMePage.assignedToMe;
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

		for (int i=1; i<assignedToMe.get_pageNumber(); i++){

			assignedToMe.inbox_assignedToMe();
			assignedToMe.click_nextButton();
		}
		assignedToMe.inbox_assignedToMe();
	}


}
