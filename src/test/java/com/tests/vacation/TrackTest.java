package com.tests.vacation;



import java.text.ParseException;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.loginSteps;
import com.steps.vacation.TrackSteps;

@RunWith(SerenityRunner.class)
public class TrackTest{


	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.4.88:9090/login")
	public Pages pages;

	@Steps
	public loginSteps LogInToEvozon;

	@Steps
	public TrackSteps trackSteps;

	@Test
	public void loginToEvozon() throws ParseException {
		LogInToEvozon.is_the_home_page();
		LogInToEvozon.login_With("malu.ioan1", "evoportal");
		trackSteps.clickOnTheVacationButton();
		trackSteps.clickOnTheTrackButton();
				
		//parcurgerea listei
		for (int i=1; i<trackSteps.getNumberPages(); i++){

			trackSteps.createTheEmployeeList();
			trackSteps.clickOnTheNextButton();
		}
		//scrierea si ultimei pagini
		trackSteps.createTheEmployeeList();
	}

}
