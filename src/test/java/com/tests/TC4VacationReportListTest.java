package com.tests;

import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.google.protobuf.TextFormat.ParseException;
import com.steps.loginSteps;
import com.steps.vacation.*;

@RunWith(ThucydidesRunner.class)
public class TC4VacationReportListTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	public Pages pages;

    @Steps
    public loginSteps LogInToEvozon;
    
    @Steps
    public VacationReportSteps reportSteps;
    

    
	 @Test
	 public void loginToEvozon() throws ParseException {
	  LogInToEvozon.is_the_home_page();
	  LogInToEvozon.login_With("malu.ioan1", "evoportal");
	  reportSteps.click_vacation();
	  reportSteps.click_vacation_report_tab();
			
		
	 for (int i=1; i<reportSteps.getNumberPages(); i++){

		   reportSteps.createList();
		   reportSteps.clickOnTheNextButton();
		  }
		} 
	  
	
	 }
	


	
