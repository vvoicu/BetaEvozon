package com.tests;

import java.util.ArrayList;
import java.util.List;

import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.loginSteps;
import com.steps.vacation.myRequestsSteps;

@RunWith(ThucydidesRunner.class)
public class TC2MyRequestsListTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.4.88:9090/")
	public Pages pages;

	@Steps
	public loginSteps login;

	@Steps
	public myRequestsSteps myRequests;

	List<String> startDate = new ArrayList<String>();
	List<String> endDate = new ArrayList<String>();
	List<String> days = new ArrayList<String>();
	List<String> type = new ArrayList<String>();
	@Test
	public void grabMyRequestList() {
		login.is_the_home_page();
		login.login_With("Flaviu.Moldovan1", "test12345");
		login.selectVacation();
		myRequests.MyRequestsList();
		
		myRequests.getStartDate(startDate);
		System.out.println(startDate);
		
		myRequests.getStartDate(endDate);
		System.out.println(endDate);
		
		myRequests.getStartDate(days);
		System.out.println(days);
		
		myRequests.getStartDate(type);
		System.out.println(type);
		
		
	}

}
