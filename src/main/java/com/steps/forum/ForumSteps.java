package com.steps.forum;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

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












