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
	public void inbox_assignToMe(){
		assignedToMeSteps.inbox_assignedToMe();
	}
	
	@Step

	public int get_pageNumber(){
	 return	assignedToMeSteps.getPageNumber();
	}
	
	@Step
	public void click_nextButton(){
		assignedToMeSteps.press_OnNextButton();
	}
	
	@Step
	public void inbox_assignedToMe(){
		assignedToMeSteps.inbox_assignedToMe();
	}

}
