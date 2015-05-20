package com.pages.vacation;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;


public class AssignedToMePage extends PageObject {

	//@FindBy(css="div[class='carousel-slider span3']:nth-child(3) >ul li:nth-child(3)>a")
	@FindBy(css=".nav-list a[href*='menuItem=inbox']")
	private WebElement inbox;

	@FindBy(css="li[class='active'] a[class='assignedToTab']")
	private WebElement assignedToMe;
	
	@FindBy(css="a.aui-paginator-next-link")
	 private WebElementFacade nextButton;


	public void press_Inbox(){
		//		element(inbox).waitUntilVisible();
		inbox.click();
	}

	public void press_AssignedToMe(){
		assignedToMe.click();
	}
	
	 public void press_OnNextButton() {
		  element(nextButton).waitUntilVisible();
		  nextButton.click();
		 }
	
	public class assignedToMe{
		String EmployeeName;
		String StartDate;
		String EndDate;
		String DaysNumber;
		String Type;
	}

	public void inbox_assignedToMe(){

		  List<WebElement> employeeNameList = getDriver().findElements(By.cssSelector("tr[class*=' results-row'] td:nth-child(2)>a"));
		  List<WebElement> startDateList = getDriver().findElements(By.cssSelector("tr[class*=' results-row'] td:nth-child(3)>a"));
		  List<WebElement> endDateList = getDriver().findElements(By.cssSelector("tr[class*=' results-row'] td:nth-child(4)>a"));
		  List<WebElement> datesNumberList = getDriver().findElements(By.cssSelector("tr[class*=' results-row'] td:nth-child(5)>a"));
		  List<WebElement> typeList = getDriver().findElements(By.cssSelector("td[id*='type_row'] a"));
		  
		List<assignedToMe> assignedList = new ArrayList<assignedToMe>();
		
		for (int i=0; i<employeeNameList.size(); i++) {
			  System.out.println(employeeNameList.get(i).getText());
			  System.out.println(startDateList.get(i).getText());
			  System.out.println(endDateList.get(i).getText());
			  System.out.println(datesNumberList.get(i).getText());
			  System.out.println(typeList.get(i).getText());
			
			assignedToMe info = new assignedToMe();
			info.EmployeeName=employeeNameList.get(i).getText();
			info.StartDate=startDateList.get(i).getText();
			info.EndDate=endDateList.get(i).getText();
			info.DaysNumber=datesNumberList.get(i).getText();
			info.Type=typeList.get(i).getText();

			assignedList.add(info);
		}
	}

	public int getPageNumber(){
		  WebElement pages= getDriver().findElement(By.cssSelector("span.aui-paginator-total"));
		  return Integer.parseInt(pages.getText().split("of ")[1].replace(") ", "delim").split("delim")[0]);
		 }
	
}
