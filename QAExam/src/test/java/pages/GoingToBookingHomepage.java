package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.booking.com/")
public class GoingToBookingHomepage extends PageObject{
	
	public GoingToBookingHomepage(WebDriver driver){
		super(driver);
		driver.manage().window().maximize();
	}

}
