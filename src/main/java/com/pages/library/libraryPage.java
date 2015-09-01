// Author: Cuceu Razvan 

package com.pages.library;

import static ch.lambdaj.Lambda.convert;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ch.lambdaj.function.convert.Converter;


@DefaultUrl("http://172.22.4.88:9090/login")
public class libraryPage extends PageObject {
	
	// Create Object Item
	public class Item{
		public String title;
		public String author;
		public String publisher;
		public String year;
			
		//constructor
		public Item(String title, String author, String publisher, String year){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;		
		}
	}
	
	//Variables
	List<Item> BookList = new ArrayList<Item>();
	public int BookListLength = 0;
	int titleLength;
	
	//FindBy
	@FindBy(css="a[href='http://172.22.4.88:9090/library']")
    private WebElementFacade libraryPage;
	
	@FindBy(css=".aui-paginator-link.aui-paginator-next-link")
    private WebElement nextButton;
	
	// This item is not what I need (need new approach)
	@FindBy(css=".aui-paginator-current-page-report.aui-paginator-total")
    private WebElementFacade noPagesLibraryItems;
	
	@FindBy(css=".aui-field-input.aui-field-input-select.aui-field-input-menu:nth-child(1)")
    private WebElementFacade noItemPerPagesLibrary;
		
	//Clicks
	public void selectLibraryPage(){
    	libraryPage.click();
    }
	
	public void selectNextButton(){
    	nextButton.click();
    }		
	
	//Get noPages variable (Total number of elements/Number of items per page)
	public int getNoPages(){
		String a = noPagesLibraryItems.getTextValue();
		String b = a.substring(a.length() - 4);
		a = b.replace(" ", "");
		b = a.replace(")","");
		a = noItemPerPagesLibrary.getTextValue(); // This is not correct because of previously @FindBy commented. I need the default value.
		//System.out.println("a= " + a);
		int result = Integer.parseInt(b)/5; // 5 represents no of elements per page. Replace with 'Integer.parseInt(a)' after correct solution found.  
		return result;
    }
	
	// Populate List with desired Elements
	public List<Item> getBookData() {
		
		//Variables
		int i;		
		Item BookData;				
		
		// List containing Titles
		WebElementFacade TitleList = find(By.className("taglib-search-iterator"));		  
	    List<WebElement> title = TitleList.findElements(By.xpath("//*[contains(@id, '_evozonlibrary_WAR_EvozonLibraryportlet_ocerSearchContainer_col-book-title_row-')]"));
	    titleLength = title.size();
	    
	    // List containing Authors
	    WebElementFacade AuthorList = find(By.className("taglib-search-iterator"));		     
	    List<WebElement> author = AuthorList.findElements(By.xpath("//*[contains(@id, '_evozonlibrary_WAR_EvozonLibraryportlet_ocerSearchContainer_col-book-author_row-')]"));
	    
	    // List containing Publishers
	    WebElementFacade PublisherList = find(By.className("taglib-search-iterator"));		  
	    List<WebElement> publisher = PublisherList.findElements(By.xpath("//*[contains(@id, '_evozonlibrary_WAR_EvozonLibraryportlet_ocerSearchContainer_col-book-publisher_row-')]"));
	    
	    // List containing Years
	    WebElementFacade YearList = find(By.className("taglib-search-iterator"));		  
	    List<WebElement> year = YearList.findElements(By.xpath("//*[contains(@id, '_evozonlibrary_WAR_EvozonLibraryportlet_ocerSearchContainer_col-book-publish-year_row-')]"));
		
	    // Add Item(title, author, publisher, year)
		for (i=0; i<titleLength; i++)
		{	
			
			BookData = new Item(title.get(i).getText(), author.get(i).getText(), publisher.get(i).getText(), year.get(i).getText());	    
			BookList.add(BookData);		 
			
		}
		return BookList;
	}
	
	// DEBUG purpose ONLY
	public void Debug(){
		int j= BookList.size();
		
		for(int i=0; i<j; i++)
		{	
	    System.out.println(" ");
		System.out.print(BookList.get(i).title + " | ");
		System.out.print(BookList.get(i).author + " | ");		
		System.out.print(BookList.get(i).publisher + " | ");
		System.out.print(BookList.get(i).year + " | ");
		System.out.println(" ");
		}	    
	}
	
	// Verify number of items in list
	public boolean VerifyItem(){
		String a = noPagesLibraryItems.getTextValue();
		String b = a.substring(a.length() - 4);		
		a = b.replace(" ", "");
		b = a.replace(")","");
		int totalNoElements = Integer.parseInt(b);
		int elementsInList = BookList.size();
		
		if (totalNoElements == elementsInList)
		{
			return true; 
		}
		else 
		{
			return false;
		}		
	}
		
	    
}
