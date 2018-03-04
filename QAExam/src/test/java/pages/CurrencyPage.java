package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class CurrencyPage extends PageObject{
	
	@FindBy(xpath = "//*[@id=\"current_currency_foldout\"]/div[1]")
	WebElement topCurrencies;
	
	@FindBy(xpath = "//*[@id=\"user_form\"]/ul/li[1]")
	WebElement currencySelection; 
	
	@FindBy(xpath = "//*[@id=\"currency_dropdown_top\"]/ul[1]/li[2]/a/span/span[1]")
	WebElement selEuro;
	
	WebDriver driver;
	WebDriverWait wait;
	
	public CurrencyPage(WebDriver driver){
		super(driver);
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}
	
	public void checkTopCurrenciesDisplays(){
		topCurrencies.isDisplayed();
	}
	
	public void clickOnEuro(){
		currencySelection.click();
		selEuro.click();
	}
	
	public void waitCurrencyPage(){
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"user_form\"]/ul/li[1]/div")));
	}
	
}