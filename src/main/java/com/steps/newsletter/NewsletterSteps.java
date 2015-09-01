package com.steps.newsletter;


import com.pages.newsletter.NewsletterPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NewsletterSteps extends ScenarioSteps{

	NewsletterPage newsletterPage;
	
	@Step
    public void home_page() {
        newsletterPage.open();
    }
	
	@Step
    public void clickNewsletter() {
        newsletterPage.click_Newsletter();
    }
	
	@Step
    public void clickNext() {
        newsletterPage.click_next();
    }
	@Step
	public void list(){
		newsletterPage.getElementFromPage();
	}
	
	
	


}
