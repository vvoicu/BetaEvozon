// Author: Cuceu Razvan 

package com.tests.library;

import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.library.libraryPage;
import com.steps.loginSteps;
import com.steps.library.librarySteps;

@RunWith(ThucydidesRunner.class)
public class TC9LibraryListTest extends ScenarioSteps{

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	// @ManagedPages(defaultUrl = "http://172.22.4.88:9090/login")
	public Pages pages;

    @Steps
    public loginSteps endUser; 
    
    @Steps
    public librarySteps libstep;
    
	@Test
	@Title("Enter Library page and create list of elements. Verify that list contains all elements.")
	public void EnterLibrary() {
		endUser.is_the_home_page();
		endUser.login_With("ramonazmole1", "ramona1");	
		libstep.selectLibraryPage();
		int pages = libstep.getNoPages();		
		for(int i=0; i< pages; i++)			// Find another way, this is not OK! but it works for now
		{
		libstep.getBookData();
		libstep.selectNextButton();
		}	
		libstep.verifyItem();
		libstep.Debug();   // This can be commented. Not relevant to the test.	
	}
		
}
