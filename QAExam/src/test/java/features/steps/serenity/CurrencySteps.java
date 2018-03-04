package features.steps.serenity;


import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import pages.CurrencyPage;

public class CurrencySteps {
	
	CurrencyPage currencyPage;
	
	@Then("^I select currency euro$")
	public void I_select_currency_euro() throws Throwable{
		currencyPage.clickOnEuro();
	}
}
