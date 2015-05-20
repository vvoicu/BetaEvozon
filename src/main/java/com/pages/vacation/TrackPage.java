package com.pages.vacation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class TrackPage extends PageObject{

	public void CreateEmployeeList() {
		
		List<WebElement> employeeNameList = getDriver().findElements(By.cssSelector("td.col-employee-name"));
		List<WebElement> startDateList = getDriver().findElements(By.cssSelector("td.align-left.col-2"));
		List<WebElement> endDateList = getDriver().findElements(By.cssSelector("td.align-left.col-3"));
					
		List<Employee> empList = new ArrayList<Employee>();
		
		
		for (int i=0; i<employeeNameList.size(); i++) {
			System.out.println(employeeNameList.get(i).getText());
			System.out.println(startDateList.get(i).getText());
			System.out.println(endDateList.get(i).getText());
			
			Employee emp = new Employee();
			emp.EmployeeName=employeeNameList.get(i).getText();
			emp.StartDate=startDateList.get(i).getText();
			emp.EndDate=endDateList.get(i).getText();
			
			empList.add(emp);
				
		}

	}
	
	public int getNumberOfPages(){
		WebElement pages= getDriver().findElement(By.cssSelector("span.aui-paginator-total"));
		return Integer.parseInt(pages.getText().split("of ")[1].replace(") ", "delim").split("delim")[0]);
	}

	public class Employee{
		String EmployeeName;
		String StartDate;
		String EndDate;
	}
	
	@FindBy(css = "ul.main-menu li a[href*='/vacation']")
	private WebElementFacade vacation;
	
	@FindBy(css = "div ul a[href*='menuItem=vacation-tracker']")
	private WebElementFacade track;

	@FindBy(name="trackerStartDate")
	private WebElementFacade trackerStartDate;

	@FindBy(name="trackerEndDate")
	private WebElementFacade trackerEndDate;

	@FindBy(css="div #buildings")
	private WebElementFacade selectBuildingField;

	@FindBy(css="div #departments")
	private WebElementFacade selectDepartmentField;

	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_departmentsALLCheckbox")
	private WebElementFacade selectAllDepartments;

	@FindBy(css="#span #_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	@FindBy(css="a.aui-paginator-next-link")
	private WebElementFacade nextButton;

	public void clickOnVacation() {
		element(vacation).waitUntilVisible();
		vacation.click();
	}
	public void clickOnTrackButtonSection() {
		element(track).waitUntilVisible();
		track.click();
	}
	public void clickOnNextButton() {
		element(nextButton).waitUntilVisible();
		nextButton.click();
	}

}
