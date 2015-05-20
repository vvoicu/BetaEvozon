package com.steps.vacation;

import java.util.List;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.EvoportalPage;
import com.pages.vacation.InboxOthersPage;
import com.pages.vacation.InboxOthersPage.Structure;

public class InboxOthersSteps extends ScenarioSteps {

	InboxOthersPage inboxOthersPage;
	EvoportalPage loginPage;

	@Step
	public void is_the_home_page() {
		loginPage.open();
	}

	@Step
	public void login_With(String user, String password) {
		loginPage.enter_userName(user);
		loginPage.enter_password(password);
		loginPage.login();
	}

	@Step
	public void selectVacation() {
		loginPage.selectVacation();
	}

	@Step
	public void selectInbox() {
		inboxOthersPage.clickInboxButton();
	}

	@Step
	public void selectAssignToOthers() {
		inboxOthersPage.clickAssignOthers();
	}

	@Step
	public void getStringsfromOthersInbox() {
		inboxOthersPage.takeIndexList();
		
	}

}
