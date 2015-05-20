package com.steps.forum;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.EvoportalPage;
import com.pages.forum.ForumPage;

@SuppressWarnings("serial")
public class ForumSteps extends ScenarioSteps {

	EvoportalPage EvoportalPage;
	ForumPage ForumPage;	
 
	@Step
	public void clickForumButton() {
		ForumPage.clickForumButton();
	}
 
     @Step
     public void CheckSumOfTotalAvailableFreeDaysLeft (){
    	 ForumPage.GetInfoFromForumCategories(); 
     }
     
}












