package com.steps.vacation;

import java.text.ParseException;

import com.pages.EvoportalPage;
import com.pages.vacation.CalendarPage;
import com.pages.vacation.LeftMenuPage;
import com.pages.vacation.TrackPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class TrackSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	CalendarPage calendarPage;
	LeftMenuPage leftMenuPage;
	TrackPage trackPage;
	EvoportalPage evoportalPage;
	
	@Step
	public void clickOnTheVacationButton() {
		trackPage.clickOnVacation();
	}
	@Step
	public void clickOnTheTrackButton() {
		trackPage.clickOnTrackButtonSection();
	}
	
	@Step
	public void createTheEmployeeList() {
		trackPage.CreateEmployeeList();
	}
	
	@Step
	public void clickOnTheNextButton() {
		trackPage.clickOnNextButton();
	}
	
	@Step
	public int getNumberPages() {
		return trackPage.getNumberOfPages();
	}
	
}
