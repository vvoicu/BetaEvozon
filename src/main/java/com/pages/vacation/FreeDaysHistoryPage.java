package com.pages.vacation;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

@DefaultUrl("http://172.22.4.88:9090/vacation")
public class FreeDaysHistoryPage extends PageObject {

	@FindBy(css = "tr td[class*='col-1']")
	private List<WebElement> operation;

	@FindBy(css = "tr td[class*='col-2']")
	private List<WebElement> type;

	@FindBy(css = "tr td[class*='col-3']")
	private List<WebElement> daysNumber;

	@FindBy(css = "tr td[class*='col-4']")
	private List<WebElement> addedData;

	@FindBy(css = "tr td[class*='col-5']")
	private List<WebElement> description;
	
	@FindBy(css="a.aui-paginator-next-link")
	private WebElement nextpage;

	@FindBy(css="[ class='aui-paginator-page-container']  a")
	private List<WebElement> numberOfPages;
	
	public String operation() {
		return String.valueOf(operation.get(0).getText());
	}

	public String type() {
		return String.valueOf(type.get(0).getText());
	}

	public String number() {
		return String.valueOf(daysNumber.get(0).getText());
	}

	public String AddedDate() {
		return String.valueOf(addedData.get(0).getText());
	}

	public String description() {
		return String.valueOf(description.get(0).getText());
	}

	public class Structura {
		public String operation, type, number, addedData, description;
		public int id;

	}

	public void takeIndexList(List<Structura> listaElemente) {

		// List<Structura> listaElemente = new ArrayList<Structura>();

		for (int i = 0; i < operation.size(); i++) {
			Structura element = new Structura();
			element.operation = operation.get(i).getText();
			element.type = type.get(i).getText();
			element.number = daysNumber.get(i).getText();
			element.addedData = addedData.get(i).getText();
			element.description = description.get(i).getText();
			element.id=listaElemente.size()+1;

			listaElemente.add(element);
		}
	}

	public void getTypes(List<String> types) {

		for (WebElement element : type) {
			types.add(element.getText());
		}
	}

	public void getOperation(List<String> operation2) {
		for (WebElement element : operation) {
			operation2.add(element.getText());
		}
	}

	public void getNumber(List<String> number) {
		for (WebElement element : daysNumber) {
			number.add(element.getText());
		}
	}

	public void getAddedData(List<String> addedData2) {
		for (WebElement element : addedData) {
			addedData2.add(element.getText());
		}
	}

	public void getDescription(List<String> description2) {
		for (WebElement element : description) {
			description2.add(element.getText());
		}
	}
	
	public void nextPage(List<String> pageNumber){
		for(WebElement element:numberOfPages){
			pageNumber.add(element.getText());
		}
	}
	
	
	public String sizeOfNextPage(){
		return String.valueOf(numberOfPages.size());
	}
	
	public void clickNextPage(){
		nextpage.click();
	}
}
