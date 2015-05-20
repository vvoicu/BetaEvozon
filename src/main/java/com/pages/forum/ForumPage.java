package com.pages.forum;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class ForumPage  extends PageObject {

	@FindBy(css="a[href*='/message_boards/category/'] strong")
    private List<WebElement> pagesTitle;
	
	@FindBy(css="td[class='align-left col-2 col-categories valign-middle']>a")
    private List<WebElement> categoriesNumber;
	
	@FindBy(css="td[class='align-left col-3 col-threads valign-middle']>a")
    private List<WebElement> threadsNumber;
	
	@FindBy(css="td[class='align-left col-4 col-posts valign-middle']>a")
    private List<WebElement> postsNumber;
	
	@FindBy(css = "a[href*='/forum']")
	private WebElement clickForumButton;
	
	public String getcategoriesTitle (){
        return String.valueOf(pagesTitle.get(0).getText());
    }
	
	public int getcateogiresnumbers() {
        return Integer.parseInt(categoriesNumber.get(0).getText());
    }
		
	public int getthreadsnumbes() {
        return Integer.parseInt(threadsNumber.get(0).getText());
    }
	
	public int getpostsnumbers() {
        return Integer.parseInt(postsNumber.get(0).getText());
    }
	
	public void clickForumButton() {
		clickForumButton.click();
	}
	
	public void GetInfoFromForumCategories(){
		
//		String titles=String.valueOf(pagesTitle.get(i).getText());
//		int categories=Integer.parseInt(categoriesNumber.get(i).getText());
//		int threads=Integer.parseInt(threadsNumber.get(i).getText());
//		int posts=Integer.parseInt(postsNumber.get(i).getText());
		List<info> infolist=new ArrayList<info>();
		for(int i = 0; i <pagesTitle.size(); i++){
			
			info element=new info();
			element.titles=String.valueOf(pagesTitle.get(i).getText());
			element.categories=String.valueOf(categoriesNumber.get(i).getText());
			element.threads=String.valueOf(threadsNumber.get(i).getText());
			element.posts=String.valueOf(postsNumber.get(i).getText());	
			infolist.add(element);
			System.out.println(infolist.get(i).titles+" "+infolist.get(i).categories+" "+infolist.get(i).threads+" "+infolist.get(i).posts+" ");
			
		}
//		for(int i=0; i<infolist.size();i++){
//			System.out.println(infolist.get(i).categories+" "+infolist.get(i).titles);
//					
//		}
	}
	
	public class info{
		String titles,categories,threads,posts;
			
	}
	
}