package com.pages.newsletter;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
//import net.thucydides.core.annotations.findby.FindBy;
//import net.thucydides.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("http://172.22.4.88:9090")
public class NewsletterPage extends PageObject {

	@FindBy(css = "a[href='http://172.22.4.88:9090/newsletter']")
	private WebElementFacade newsletter;

	@FindBy(css = "a[class='aui-paginator-link aui-paginator-next-link']")
	private WebElementFacade next;

	public void click_Newsletter() {
		newsletter.click();

	}

	public void click_next() {
		next.click();

	}

	@FindBy(css = "h2[class='newstitle-h2']")
	private List<WebElement> titleRows;

	@FindBy(css = "div[class='newscontent-p']")
	private List<WebElement> contentRows;

	@FindBy(css = "p[style='text-align']")
	private List<WebElement> textRows;

	@FindBy(css = "div[class='newscontent-p']")
	private WebElement content;

	@FindBy(css = "h2[class='newstitle-h2']")
	private List<WebElement> firstTitle;
	
	@FindBy(css= "span[class='aui-paginator-link aui-paginator-next-link']")
	private WebElement finishnext;

	public void getElementFromPage() {

		List<ObjectTC> infolist = new ArrayList<ObjectTC>();
		List<WebElement> titleList = getDriver().findElements(
				By.className("newstitle-h2"));
		List<WebElement> contentList = getDriver().findElements(
				By.className("newscontent-p"));

		for (int i = 0; i < contentList.size(); i++) {
			ObjectTC element = new ObjectTC();
			element.title = titleList.get(i).getText();
			element.content = contentList.get(i).getText();
			infolist.add(element);
			System.out.println(i);
			
			System.out.println(infolist.get(i).title);
			System.out.println(infolist.get(i).content);
			
		}
		System.out.println("Size list for this page is:" + infolist.size());
		
	}
	
	//public boolean isNextAvailable(){
		//return element(finishnext).isCurrentlyVisible();
	//}
	
	

}
