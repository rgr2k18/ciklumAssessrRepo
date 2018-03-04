package features.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.steps.serenity.HomepageSteps;
import features.steps.serenity.LanguageSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pages.GoingToBookingHomepage;
import pages.LanguagePage;

public class StepsDefinitions {
	
	@Steps
	HomepageSteps homepage;
	
	@Steps
	LanguageSteps language;
	
	@Given("^I open booking page$")
	public void I_open_booking_page() throws Throwable {
		homepage.open_booking_page();
	}
	
	@When("^I check the logo displaying$")
	public void I_check_the_logo_displaying() throws Throwable{
		homepage.checkLogoLoaded();
	}
	
	@Then("^I should see the homepage title$")
	public void I_should_see_the_homepage_title() throws Throwable{
		homepage.checkHomePageTitle();
	}
	
	@When("^I click on language selection area$")
	public void I_click_on_language_selection_area() throws Throwable{
		homepage.clickOnLangSelectorArea();
	}
}