package com.pages.vacation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;


public class CalendarPage extends PageObject {
	
	@FindBy(css = "input[name='startDate']")
	private WebElement startDateInput;

	@FindBy(css = "input[name='endDate']")
	private WebElement endDateInput;

	//@FindBy(css = "div[aria-hidden='false'] .aui-calendar-title")
	@FindBy(css = "div.Zebra_DatePicker[style*='block'] tr td.dp_caption")
	private WebElement calendarTitle;

	//@FindBy(css = "div[aria-hidden='false'] .aui-icon.aui-icon-circle-triangle-r.aui-calendar-next")
	@FindBy(css = "div.Zebra_DatePicker[style*='block'] tr td.dp_next")
	private WebElement nextButton;

	@FindBy(css = "div.Zebra_DatePicker[style*='block'] tr td.dp_previous")
	private WebElement previousButton;

	public void setDate(int month, int day, int year) throws ParseException {

		Calendar calNew = Calendar.getInstance();
		SimpleDateFormat sdfNew = new SimpleDateFormat("dd/MM/yyyy");
		calNew.setTime(sdfNew.parse("1/" + String.valueOf(month) + "/"
				+ String.valueOf(year)));

		Calendar cal = Calendar.getInstance();
		do {
			element(calendarTitle).waitUntilVisible();
			String MandY = calendarTitle.getText();
			SimpleDateFormat sdf = new SimpleDateFormat("MMM, yyyy dd");
			System.out.println(MandY );
			cal.setTime(sdf.parse(MandY + " 1"));

			if (cal.compareTo(calNew) == -1) {
				nextButton.click();
			}
			if (cal.compareTo(calNew) == 1) {
				previousButton.click();
			}
		} while (cal.compareTo(calNew) != 0);

		List<WebElement> days = getDriver()
				.findElements(
						By.cssSelector("div.Zebra_DatePicker[style*='block'] table.dp_daypicker td:not(.dp_not_in_month)"));
		for (WebElement currentDay : days) {
			if (currentDay.getText().toLowerCase()
					.equals(String.valueOf(day).toLowerCase()))
				currentDay.click();
		
		}

	}
	
	public void enterStartDate() {
		element(startDateInput).waitUntilVisible();
		startDateInput.click();
	}

	public void enterEndDate() {
		element(endDateInput).waitUntilVisible();
		endDateInput.click();
	}

}