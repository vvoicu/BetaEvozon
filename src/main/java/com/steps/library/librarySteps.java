// Author: Cuceu Razvan 

package com.steps.library;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import java.util.List;

import com.pages.library.libraryPage;
import com.pages.library.libraryPage.Item;
import static org.junit.Assert.*;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class librarySteps extends ScenarioSteps {

    libraryPage libraryPage;
    
    @Step
    public void selectLibraryPage() {
        libraryPage.selectLibraryPage();
    }  
    
    @Step
    public void selectNextButton() {
        libraryPage.selectNextButton();
    }  
    
    @Step
    public int getNoPages() {
        return libraryPage.getNoPages();        
    }  
    
    @Step
    public List<Item> getBookData() {     	
    	return libraryPage.getBookData();
    }
    
    @Step
    public void Debug() {     	
    	libraryPage.Debug();
    }
        
    @Step
    public void verifyItem() {
    	assertTrue(libraryPage.VerifyItem());      
    }   
}