package com.tests.vacation;

import java.util.ArrayList;
import java.util.List;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.vacation.FreeDaysHistoryPage.Structura;
import com.pages.vacation.LeftMenuPage;
import com.steps.loginSteps;
import com.steps.vacation.FreeDaysHistorySteps;
import com.steps.vacation.LeftMenuSteps;

@RunWith(ThucydidesRunner.class)
public class FreeDaysHistoryTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public loginSteps loginUser;

	@Steps
	public FreeDaysHistorySteps freeDaysHistory;

	@Steps
	public LeftMenuSteps leftMenu;

	@Test
	public void saveListFromTable() {
		loginUser.is_the_home_page();
		loginUser.login_With("ramonazmole1", "ramona1");
		loginUser.loginButton();
		loginUser.selectVacation();
		leftMenu.selectFreeDaysHistory();
		
		int sizeOfNextPage = Integer.parseInt(freeDaysHistory.sizeOfNextPage());
		List<String> operation = new ArrayList<String>();
		List<String> types = new ArrayList<String>();
		List<String> number = new ArrayList<String>();
		List<String> addedData = new ArrayList<String>();
		List<String> description = new ArrayList<String>();
		for (int i = 1; i < sizeOfNextPage; i++) {
			// Operation
				freeDaysHistory.getOperation(operation);
			System.out.println(operation);
			// Types
			freeDaysHistory.getType(types);
			System.out.println(types);
			// Number
			freeDaysHistory.getNumber(number);
			System.out.println(number);
			// AddedData
			
			freeDaysHistory.getAddedData(addedData);
			System.out.println(addedData);
			// Description	
			freeDaysHistory.getDescription(description);
			System.out.println(description);
			// TakeIndex
			// 
			freeDaysHistory.indexList();
			// System.out.println(index);
			freeDaysHistory.nextPage();
		}
		
		freeDaysHistory.printElementFromIndex(9);
	}
}
