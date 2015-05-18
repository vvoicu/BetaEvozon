package com.pages.vacation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/vacation")
public class LeftMenuPage extends PageObject {

	@FindBy(css = "div ul a[href*='menuItem=new-request']")
	private WebElementFacade newRequest;

	@FindBy(css = "div ul a[href*='menuItem=my-requests']")
	private WebElementFacade myRequests;

	@FindBy(css = "div ul a[href*='menuItem=my-free-days']")
	private WebElementFacade myFreeDays;

	@FindBy(css = "div ul a[href*='menuItem=free-days-history']")
	private WebElementFacade freeDaysHistory;

	@FindBy(css = "div ul a[href*='menuItem=vacation-tracker']")
	private WebElementFacade track;

	public void selectNewVacation() {
		newRequest.click();
	}

	public void selectMyRequests() {
		element(myRequests).waitUntilVisible();
		myRequests.click();
	}

	public void selectMyFreeDays() {
		myFreeDays.click();
	}

	public void selectFreeDaysHistory() {
		freeDaysHistory.click();
	}

	public void selectTrack() {
		track.click();
	}
}
