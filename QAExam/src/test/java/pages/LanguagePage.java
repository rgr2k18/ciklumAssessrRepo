package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

import static org.assertj.core.api.Assertions.assertThat;

@DefaultUrl("https://www.booking.com/")
public class LanguagePage extends PageObject{
	
	@FindBy(xpath = "//*[@id=\"current_language_foldout\"]/div[1]")
	WebElement mostUsedLanguages; 
	
	@FindBy(xpath = "//*[@id=\"user_form\"]/ul/li[2]")
	WebElement selDescription; 
	
	@FindBy(linkText = "English (US)")
	WebElement chooseLanguage; 
	
	@FindBy(id = "language-popup-description")
	WebElement languageDescription;

	WebDriver driver;
	WebDriverWait wait;
	
	public LanguagePage(WebDriver driver){
		super(driver);
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}
	
	public void checkMostUsedLanguagesDisplays(){
		mostUsedLanguages.isDisplayed();
	}
	
	public void checkLangDescription(String userName){
		assertThat(languageDescription.getText()).contains("Pick your preferred language. We speak English and 42 other languages.");
	}
	
	public void checkPanelHeaderLoaded(){
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("current_language")));
	}
	
	public void selectLanguage() throws InterruptedException{	
		selDescription.click();
	}
	
	public void chooseLanguage() {
		chooseLanguage.click();
	}

}