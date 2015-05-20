package com.steps.vacation;

import java.util.ArrayList;
import java.util.List;

import com.pages.vacation.FreeDaysHistoryPage.Structura;
import com.pages.vacation.LeftMenuPage;
import com.pages.vacation.myRequestsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.vacation.*;

;

public class FreeDaysHistorySteps extends ScenarioSteps {

	List<Structura> listaElemente = new ArrayList<Structura>();

	LeftMenuPage leftMenu;
	FreeDaysHistoryPage freeDaysHistory;

	@Step
	public void indexList() {
		freeDaysHistory.takeIndexList(listaElemente);
	}

	@Step
	public void getType(List<String> types) {
		freeDaysHistory.getTypes(types);

	}

	public void getOperation(List<String> operation) {
		freeDaysHistory.getOperation(operation);

	}

	@Step
	public void getNumber(List<String> number) {
		freeDaysHistory.getNumber(number);

	}

	@Step
	public void getAddedData(List<String> addedData) {
		freeDaysHistory.getAddedData(addedData);

	}

	@Step
	public void getDescription(List<String> description2) {
		freeDaysHistory.getDescription(description2);
	}

	@Step
	public void Index(List<Structura> index) {
		freeDaysHistory.takeIndexList(index);
	}

	@Step
	public void nextPage() {
		freeDaysHistory.clickNextPage();
	}

	@Step
	public String sizeOfNextPage() {
		return freeDaysHistory.sizeOfNextPage();
	}

	public void printElementFromIndex(int i) {
		System.out.println("Elementul de la indexul " + i +" "+ "contine: "
				+ listaElemente.get(i).operation + " "
				+ listaElemente.get(i).type + " " + listaElemente.get(i).number
				+ " " + listaElemente.get(i).addedData + " "
				+ listaElemente.get(i).description);

	}
}
