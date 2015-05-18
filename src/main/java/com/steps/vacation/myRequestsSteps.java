package com.steps.vacation;

import com.pages.vacation.LeftMenuPage;
import com.pages.vacation.myRequestsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class myRequestsSteps extends ScenarioSteps {
	LeftMenuPage leftMenu;
	myRequestsPage myRequests;

	@Step
	public void selectMyRequests() {
		leftMenu.selectMyRequests();
	}

	@Step
	public void selectApproved() {
		myRequests.selectAproved();
	}

	@Step
	public void selectSpecialVacation() {
		myRequests.selectSpecialVacation();
	}

	@Step
	public void selectPending() {
		myRequests.selectPending();
	}

	@Step
	public void selectApplyButton() {
		myRequests.applyButton();
	}
	
	@Step
	public void checkIfTypeIsPresent(String typeColumnTitle) {
		myRequests.checkIfTypeIsPresent(typeColumnTitle);
	}
	
	@Step
	public void checkIfStatusIsPresent(String statusColumn){
		myRequests.checkIfStatusIsPresent(statusColumn);
	}
	
	@Step
	public void selectStatus(int x){
		myRequests.selectStatus(x);
	}
	
	@Step 
	public void selectWithdraw(){
		myRequests.selectWithdraw();
	}
	
}
