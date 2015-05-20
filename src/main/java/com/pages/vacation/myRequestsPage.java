package com.pages.vacation;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

@DefaultUrl("http://172.22.4.88:9090/vacation")
public class myRequestsPage extends PageObject {

	/*	
	@FindBy(css = ".taglib-search-iterator")
	private WebElement listContainer;

	@FindBy(css = "tr td[class*='col-6'] a")
	private List<WebElement> statusElement;
	*/
	@FindBy(css = "tr td[class*='col-1']")
	private List<WebElement> startDate;
	
	@FindBy(css = "tr td[class*='col-2']")
	private List<WebElement> endDate;
	
	@FindBy(css = "tr td[class*='col-3']")
	private List<WebElement> days;
	
	@FindBy(css = "tr td[class*='col-4']")
	private List<WebElement> type;
	
	@FindBy(css = "a[href='http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_delta=5&_evovacation_WAR_EvoVacationportlet_keywords=&_evovacation_WAR_EvoVacationportlet_advancedSearch=false&_evovacation_WAR_EvoVacationportlet_andOperator=true&_evovacation_WAR_EvoVacationportlet_orderByCol=lastUpdate&_evovacation_WAR_EvoVacationportlet_orderByType=desc&_evovacation_WAR_EvoVacationportlet_resetCur=false&cur=2']")
	private WebElement nextPageButton;
	
	@FindBy(css = "[ class='aui-paginator-page-container'] a")
	private List<WebElement> numberOfPages;
	
	@FindBy(css = "span[class='aui-paginator-link aui-paginator-last-link']")
	private WebElementFacade LastPageButton;
	
		
	public String startDate() {
		  return String.valueOf(startDate.get(0).getText());
		 }	
	
	public String endDate() {
		  return String.valueOf(endDate.get(0).getText());
		 }	

	public String days() {
		  return String.valueOf(days.get(0).getText());
		 }	
	
	public String type() {
		  return String.valueOf(type.get(0).getText());
		 }	
	
	public class Structura {
		  public String startDate, endDate,	days, type;
          public int id;
		 }
	public void takeMyRequestList(List<Structura> listaElemente) {

		  // List<Structura> listaElemente = new ArrayList<Structura>();

		 for (int i = 0; i < startDate.size(); i++) {
		   Structura element = new Structura();
		   element.startDate = startDate.get(i).getText();
		   element.endDate = endDate.get(i).getText();
		   element.days = days.get(i).getText();
		   element.type = type.get(i).getText();
           element.id=listaElemente.size()+1;
           
		   listaElemente.add(element);
		  }
		 }
		
	public void getStartDate(List<String> startDate1){
		for(WebElement element : startDate){
			startDate1.add(element.getText());
		}
		}
	
	public void getEndDate(List<String> endDate1){
		for(WebElement element : endDate){
			endDate1.add(element.getText());
		}
		}
	
	public void getDays(List<String> days1){
		for(WebElement element : days){
			days1.add(element.getText());
		}
		}
	
	public void getType(List<String> type1){
		for(WebElement element : type){
			type1.add(element.getText());
		}
		}
	
	public void clickNextPageButton(){
		nextPageButton.click();
		}
	
	public String sizeOfNextPage(){
		return String.valueOf(numberOfPages.size());
	}
	
	public void nextPage(List<String> pageNumber){
		for(WebElement element:numberOfPages){
			pageNumber.add(element.getText());
		}
	}
}
