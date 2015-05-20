package com.pages;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.WebElement;



@DefaultUrl("http://172.22.4.88:9090/vacation")
public class VacationReportPage extends PageObject {

	    @FindBy(css = "ul.main-menu li a[href*='/vacation']")
	     private WebElementFacade vacation;

	    @FindBy(css="div ul li a[href*='vacation-report']")
	    private WebElementFacade vacationReportTab;
	    
	    @FindBy(css="div.page-links")
	    private WebElementFacade pagesNumbers;
	    
	    
	    @FindBy(css=".aui-paginator-link#aui_3_4_0_1_1978")
	    private WebElementFacade prevButton;
	    
	    @FindBy(css="a.aui-paginator-next-link")
	    private WebElementFacade nextButton;
	      
	  
	    public void select_vacation(){
	    	vacation.click();
	    }
	    
	    
	    public void select_vacation_report(){
	    	vacationReportTab.click();
	    }
	    
	    public void select_previous_button(){
	    	prevButton.click();
	    	
	    	
	    }
	    
        public void select_next_button(){
	    	
	    nextButton.click();	
	    }
	    
	    
	    

	 public void createMyList() {
  
    List<WebElement> lastNameList =getDriver().findElements(By.cssSelector("td[class*='col-1']"));
    List<WebElement> firstNameList =getDriver().findElements(By.cssSelector("td[class*='col-2']"));
    
    
	
    List<Name> reportList = new ArrayList<Name>();
    
      int i=0;
    
    for(i=0;i < lastNameList.size(); i++) {
    	 
    	System.out.println(lastNameList.get(i).getText() + firstNameList.get(i).getText() );
    		
    	
    	
    		
    
    Name name= new  Name();
    
    name.lastName=lastNameList.get(i).getText();
    name.firstName=firstNameList.get(i).getText();
    
    reportList.add(name);
    
    }  
	 }
    
    public int getNumberOfPages(){
  	  WebElement pages= getDriver().findElement(By.cssSelector("span.aui-paginator-total"));
  	  return Integer.parseInt(pages.getText().split("of ")[1].replace(") ", "delim").split("delim")[0]);
  	 
   
  	
}
    public class Name{
    	public String lastName;
		public String firstName;
		
    
	 }
	 
    
		
        
   
    
    
    }

    
   






