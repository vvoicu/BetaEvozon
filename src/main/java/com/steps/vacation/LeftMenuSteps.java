package com.steps.vacation;

import com.pages.vacation.FreeDaysHistoryPage;
import com.pages.vacation.LeftMenuPage;
import com.pages.vacation.myRequestsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LeftMenuSteps {

	LeftMenuPage leftMenu;
	FreeDaysHistoryPage freeDays;
	
	@Step
	public void selectFreeDaysHistory(){
	leftMenu.selectFreeDaysHistory();
	}
}
