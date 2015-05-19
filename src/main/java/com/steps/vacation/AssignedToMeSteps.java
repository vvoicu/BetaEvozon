package com.steps.vacation;

import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pages.vacation.AssignedToMePage;

public class AssignedToMeSteps extends ScenarioSteps{

	AssignedToMePage assignedToMeSteps;
	
	@Step
	public void click_Inbox(){
		assignedToMeSteps.press_Inbox();
	}
	
	@Step
	public void click_AssignedToMe(){
		assignedToMeSteps.press_AssignedToMe();
		}
	
	@Step
	public void check_employeeName(String element){
		assignedToMeSteps.get_employeeName(element);
	}
	
	@Step
	public void check_startDate(){
		assignedToMeSteps.get_startDate();
	}
	
	@Step
	public void check_endDate(){
		assignedToMeSteps.get_endDate();
	}
	
	@Step
	public void check_daysNumber(){
		assignedToMeSteps.get_daysNumber();
	}
	
	@Step
	public void check_type(String element){
		assignedToMeSteps.get_type(element);
	}
	
}
