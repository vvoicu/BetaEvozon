package com.pages.vacation;

import java.util.ArrayList;
import java.util.List;

import org.apache.xalan.templates.ElemApplyImport;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://172.22.4.88:9090")
public class InboxOthersPage extends PageObject {

	@FindBy(css = "a[href*='menuItem=inbox&_evovacation_WAR_EvoVacationportlet_assignToTab=assignedToOthers']")
	private WebElement assignToOthers;

	@FindBy(css = "td[id*='employee-name_row']")
	private List<WebElement> employeeName;

	@FindBy(css = "td[id*='start.date_row']")
	private List<WebElement> startDate;

	@FindBy(css = "td[id*='end.date_row']")
	private List<WebElement> endDate;

	@FindBy(css = "td[id*='day.number_row']")
	private List<WebElement> daysNr;

	@FindBy(css = "td[id*='assignee_row']")
	private List<WebElement> asignee;

	@FindBy(css = "td[id*='type_row']")
	private List<WebElement> type;

	@FindBy(css = "a[href*='menuItem=inbox']")
	private WebElement inboxButton;

	public String getEmployeeName() {
		return String.valueOf(employeeName.get(0).getText());

	}

	public String getStartDate() {
		return String.valueOf(startDate.get(0).getText());
	}

	public String getEndDate() {
		return String.valueOf(endDate.get(0).getText());
	}

	public String getDaysNr() {
		return String.valueOf(daysNr.get(0).getText());
	}

	public String getAsignee() {
		return String.valueOf(asignee.get(0).getText());
	}

	public String getTypeRow() {
		return String.valueOf(type.get(0).getText());
	}

	public class Structure {
		public String employeeName, startDate, endDate, daysNr, asignee, type;
	}

	public void takeIndexList() {
		List<Structure> elementsList = new ArrayList<InboxOthersPage.Structure>();
		for (int i = 0; i < employeeName.size(); i++) {
			Structure element = new Structure();

			element.employeeName = employeeName.get(i).getText();
			element.startDate = startDate.get(i).getText();
			element.endDate = endDate.get(i).getText();
			element.daysNr = daysNr.get(i).getText();
			element.asignee = asignee.get(i).getText();
			element.type = type.get(i).getText();

			elementsList.add(element);
			System.out.println(employeeName.get(i).getText() + " "
					+ startDate.get(i).getText() + " "
					+ endDate.get(i).getText() + " " + daysNr.get(i).getText()
					+ " " + asignee.get(i).getText() + " "
					+ type.get(i).getText());
		}
	}

	public void clickAssignOthers() {
		assignToOthers.click();
	}

	public void clickInboxButton() {
		element(inboxButton).waitUntilVisible();

		inboxButton.click();
	}
}
