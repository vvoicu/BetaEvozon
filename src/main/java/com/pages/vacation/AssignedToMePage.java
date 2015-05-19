package com.pages.vacation;

import net.thucydides.core.pages.PageObject;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.jruby.ir.operands.Array;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://172.22.4.88:9090/vacation")
public class AssignedToMePage extends PageObject {

	//@FindBy(css="div[class='carousel-slider span3']:nth-child(3) >ul li:nth-child(3)>a")
	@FindBy(css=".nav-list a[href*='menuItem=inbox']")
	private WebElement inbox;

	@FindBy(css="li[class='active'] a[class='assignedToTab']")
	private WebElement assignedToMe;

	@FindBy(css="tr[class*=' results-row'] td:nth-child(2)>a")
	private List<WebElement> employNamerow;

	@FindBy(css="tr[class*=' results-row'] td:nth-child(3)>a")
	private List<WebElement> startDaterow;

	@FindBy(css="tr[class*=' results-row'] td:nth-child(4)>a")
	private List<WebElement> endDaterow;

	@FindBy(css="tr[class*=' results-row'] td:nth-child(5)>a")
	private List<WebElement> daysNumberrow;

	@FindBy(css="td[id*='type_row'] a")
	private List<WebElement> typerow;


	public void press_Inbox(){
		//		element(inbox).waitUntilVisible();
		inbox.click();
		System.out.println("click pe Inbox");
	}

	public void press_AssignedToMe(){
		assignedToMe.click();
	}

	public void get_employeeName(String elem){
		List<String> employeeList= new ArrayList<String>();
		//	    boolean found=false;
		for(WebElement item:employNamerow){
			//		 if (item.getText().contains(elem)){
			//			 found=true;
			//		 }
			//	 }
			//		Assert.assertTrue("Name doesn't found", found);
			employeeList.add(item.getText());
			System.out.println("Employee Name:"+ item.getText());
		}
	}

	public void get_startDate(){
		List<String> startDateList= new ArrayList<String>();
		for(WebElement item:startDaterow){
			startDateList.add(item.getText());
			System.out.println("Start date:"+ item.getText());
		}
	}

	public void get_endDate(){
		List<String> endDateList= new ArrayList<String>();
		for(WebElement item:endDaterow){
			endDateList.add(item.getText());
			System.out.println("End date:"+ item.getText());
		}
	}

	public void get_daysNumber(){
		List<String> daysNumberList= new ArrayList<String>();
		for(WebElement item:daysNumberrow){
			daysNumberList.add(item.getText());
			System.out.println("Days number:"+ item.getText());
		}
	}

	public void get_type(String elem){
		List<String> typeList= new ArrayList<String>();
		for(WebElement item:typerow){
			typeList.add(item.getText());
			System.out.println("Type:"+ item.getText());
		}
	}


}
