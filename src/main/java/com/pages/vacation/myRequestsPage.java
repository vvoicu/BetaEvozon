package com.pages.vacation;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://172.22.4.88:9090/vacation")
public class myRequestsPage extends PageObject {

	@FindBy(css = "[value='Apply']")
	private WebElementFacade apply;

	@FindBy(css = "input[value='APPROVED'][type='checkbox']")
	private WebElementFacade approved;

	@FindBy(css = "input[type='checkbox'][value='SPECIAL_VACATION']")
	private WebElementFacade specialVacation;

	@FindBy(css = "input[type='checkbox'][value='PENDING']")
	private WebElementFacade pending;

	@FindBy(css = "tr td[class*='col-4']")
	private List<WebElement> typeColumnElements;

	@FindBy(css = "tr td[class*='col-6'] a")
	private List<WebElement> statusElement;

	@FindBy(css = "input[value='Withdraw']")
	private WebElement Withdraw;

	public void applyButton() {
		apply.click();
	}

	public void selectAproved() {
		approved.click();
	}

	public void selectSpecialVacation() {
		specialVacation.click();
	}

	public void selectPending() {
		pending.click();
	}

	public void checkIfTypeIsPresent(String categoryName) {
		boolean found = false;
		for (WebElement element : typeColumnElements) {
			System.out.println(element.getText().toLowerCase() + " "
					+ categoryName.toLowerCase());
			if (!element.getText().toLowerCase()
					.contains(categoryName.toLowerCase())) {
				found = true;
			}
		}
		Assert.assertFalse("Another type found", found);
	}

	public void checkIfStatusIsPresent(String status) {
		boolean found = false;
		for (WebElement element : statusElement) {
			System.out.println(element.getText().toLowerCase() + " "
					+ status.toLowerCase());
			if (!element.getText().toLowerCase().contains(status.toLowerCase())) {
				found = true;
			}
		}
		Assert.assertFalse("Another type found", found);
	}

	public void selectStatus(int x) {
		statusElement.get(x).click();
	}

	public void selectWithdraw() {
		Withdraw.click();
	}

}
