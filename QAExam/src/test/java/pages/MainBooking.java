package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

import static org.junit.Assert.assertTrue;

public class MainBooking extends PageObject{
	
	@FindBy(xpath = "//*[@id=\"logo_no_globe_new_logo\"]")
	WebElement logoBooking; 
	
	@FindBy(id = "b_tt_holder_1")
	WebElement currencySelector;
	
	@FindBy(xpath = ".//*[@id='b_tt_holder_2']/img")
	WebElement languageSelector;

	WebDriver driver;
	WebDriverWait wait;
	
	public MainBooking(WebDriver driver){
		super(driver);
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}
	
	public void checkLogoBookingDisplays(){
		logoBooking.isDisplayed();
	}
	
	public void checkPageTitle(){
		assertTrue(driver.getTitle().contains("Booking.com"));
	}
	
	public void clickOnLogoBooking(){
		logoBooking.click();
	}
	
	public void clickOnLangSelector() {
		logoBooking.click();
	}
	
	public void clickOnCurrencySelector(){
		currencySelector.click();
	}
	
	public void checkPanelHeaderLoaded(){
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"top\"]/div")));
	}
}