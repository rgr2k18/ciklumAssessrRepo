package features.steps.serenity;


import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import pages.LanguagePage;

public class LanguageSteps {
	
	LanguagePage languagePage;
	
	@Then("^I should see the language panel$")
	public void I_should_see_the_language_panel() throws Throwable{
		languagePage.checkPanelHeaderLoaded();
	}
	
	@Then("^I select english us$")
	public void I_select_english_us() throws Throwable{
		languagePage.selectLanguage();
		languagePage.chooseLanguage();
	}
}
