package features.steps.serenity;

import net.thucydides.core.annotations.Step;
import pages.GoingToBookingHomepage;
import pages.LanguagePage;
import pages.MainBooking;

public class HomepageSteps {
	
	GoingToBookingHomepage homepage;
	MainBooking mainBooking;
	LanguagePage languagePage;
	
	@Step("open booking page")
	public void open_booking_page() throws Throwable{
		homepage.open();
	}
	
	@Step("I Check the logo displaying")
	public void checkLogoLoaded(){
		mainBooking.checkLogoBookingDisplays();
	}
	
	@Step("Check homepage title")
	public void checkHomePageTitle(){
		mainBooking.checkPageTitle();
	}
	
	@Step("Click on language selection area")
	public void clickOnLangSelectorArea() {
		mainBooking.clickOnLangSelector();
	}
}