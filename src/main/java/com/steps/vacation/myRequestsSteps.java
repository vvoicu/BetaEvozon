package com.steps.vacation;

import java.util.ArrayList;
import java.util.List;

import com.pages.vacation.myRequestsPage.Structura;
import com.pages.vacation.LeftMenuPage;
import com.pages.vacation.myRequestsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import java.util.List;

public class myRequestsSteps extends ScenarioSteps {
	
	List<Structura> listaElemente = new ArrayList<Structura>();
	
	LeftMenuPage leftMenu;
	myRequestsPage myRequests;

	@Step
	public void MyRequestsList() {
		myRequests.takeMyRequestList(listaElemente);
	}
	
 
	 @Step
	 public void getStartDate(List<String> startDate1) {
		 myRequests.getStartDate(startDate1);
	  
	 }
	 
	 @Step
	 public void getEndDate(List<String> endDate1) {
		 myRequests.getEndDate(endDate1);
	  
	 }
	 
	 @Step
	 public void getDays(List<String> days) {
		 myRequests.getDays(days);
	  
	 }
	 
	 @Step
	 public void getType(List<String> type1) {
		 myRequests.getType(type1);
	  
	 }
	 @Step
	 public void MyRequests(List<Structura> MyRequests) {
		 myRequests.takeMyRequestList(MyRequests);
		}
	 
	 @Step
	 public void nextPage() {
		 myRequests.clickNextPageButton();
		}
	 
	 @Step
	 public String sizeOfNextPage() {
			return myRequests.sizeOfNextPage();
		}
	 
	 public void printElementFromMyRequest(int i) {
			System.out.println("Elementul de la categoria " + i +" "+ "contine: "
					+ listaElemente.get(i).startDate + " "
					+ listaElemente.get(i).endDate + " " + listaElemente.get(i).endDate
					+ " " + listaElemente.get(i).days + " "
					+ listaElemente.get(i).type);

		}
}
