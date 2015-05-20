package com.steps.vacation;

import com.pages.VacationReportPage;
import com.pages.vacation.LeftMenuPage;
import com.pages.vacation.myRequestsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;


public class VacationReportSteps extends ScenarioSteps {
	
	  VacationReportPage vacationReportSteps;
	  VacationReportPage vacationReportPage;
	  
	
  @Step
	  
	  public void click_vacation() {
		   
		  vacationReportSteps.select_vacation();
	  }
	  
	  
	  @Step
	  
	  public void click_vacation_report_tab() {
		   
		  vacationReportSteps.select_vacation_report();
	  }
	 	   
	  
@Step
	  
	  public void createList (){
		   
		 vacationReportSteps.createMyList();
	  }
	 	   
         @Step

     public void clickOnTheNextButton(){
	   
	 vacationReportSteps.select_next_button();
}


 @Step
	  
	  public int getNumberPages(){
		   
		  return vacationReportPage.getNumberOfPages();
	  }
	 	   
	  
	
	  
}