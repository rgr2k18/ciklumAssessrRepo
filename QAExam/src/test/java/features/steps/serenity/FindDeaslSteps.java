package features.steps.serenity;


import cucumber.api.java.en.Then;
import pages.FindDeaslPage;

public class FindDeaslSteps {
	
	FindDeaslPage findDeasPage;
	
	@Then("^I filled the fields to search$")
	public void I_filled_the_fields_to_search() throws Throwable{
		findDeasPage.checkFormDealsDisplays();
		findDeasPage.checkFormMainText();
		findDeasPage.fillOnDestinationSearch("Málaga, Andaluciá, Spain");
		findDeasPage.pressEsc();
		findDeasPage.selectAdultsSelection("1 adult");
		findDeasPage.selectChildrenSelection("1 child");
		findDeasPage.selectChildrenAge("5 years old");
		findDeasPage.selectRoomsSelection("2 rooms");
		findDeasPage.checkTravel();
		findDeasPage.clickOnSearch();
		
	}
}
