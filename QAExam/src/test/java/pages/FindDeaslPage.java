package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

import static org.assertj.core.api.Assertions.assertThat;

public class FindDeaslPage extends PageObject{
	
	@FindBy(id = "frm")
	WebElement findDealsForm; 
	
	@FindBy(xpath = "//*[@id=\"frm\"]/div[1]/h2/span")
	WebElement formMainText;
	
	@FindBy(id = "ss")
	WebElement destinationSearch;
	
	@FindBy(xpath = "//*[@id=\"frm\"]/div[3]/div/div[1]/div[1]/div/div/div[1]/div/div[2]")
	WebElement checkInDate;
	
	@FindBy(xpath = "//*[@id=\"frm\"]/div[3]/div/div[1]/div[2]/div/div/div[1]/div/div[2]")
	WebElement checkOutDate;
	
	@FindBy(id = "group_adults")
	WebElement selectAdults;
	
	@FindBy(id = "group_adults")
	Select selectAdultsSelection;
	
	@FindBy(id = "group_children")
	WebElement selectChildren;
	
	@FindBy(id = "group_adults")
	Select selectChildrenSelection;
	
	@FindBy(xpath = "//*[@id=\"frm\"]/div[4]/div/div/div/div[2]/div[2]/div/div/select")
	WebElement selectChildrenAge;
	
	@FindBy(xpath = "//*[@id=\"frm\"]/div[4]/div/div/div/div[2]/div[2]/div/div/select")
	Select selectChildrenAgeSelection;
	
	@FindBy(id = "no_rooms")
	WebElement selectRooms;
	
	@FindBy(id = "no_rooms")
	Select selectRoomsSelection;
	
	@FindBy(xpath = "//*[@id=\"frm\"]/div[5]/div[1]/div[2]/label/input")
	WebElement checkTravelWorkPurpose; 
	
	@FindBy(xpath = "//*[@id=\"frm\"]/div[5]/div[2]/button")
	WebElement searchButton;

	WebDriver driver;
	WebDriverWait wait;
	
	public FindDeaslPage(WebDriver driver){
		super(driver);
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}
	
	public void checkFormDealsDisplays(){
		findDealsForm.isDisplayed();
	}
	
	public void clickOnDestinationSearch(){
		destinationSearch.click();
	}
	
	public void fillOnDestinationSearch(String destination){
		destinationSearch.sendKeys(destination);
	}
	
	public void clickOnCheckInDate(){
		checkInDate.click();
	}
	
	public void clickOnCheckOutDate(){
		checkOutDate.click();
	}
	
	public void selectAdultsSelection(String adultsNumber){
		selectAdultsSelection.selectByVisibleText(adultsNumber);
	}
	
	public void selectChildrenSelection(String childrenNumber){
		selectChildrenSelection.selectByVisibleText(childrenNumber);
	}
	
	public void selectChildrenAge(String childrenAgeNumber){
		selectChildrenAgeSelection.selectByVisibleText(childrenAgeNumber);
	}
	
	public void selectRoomsSelection(String roomsNumber){
		selectRoomsSelection.selectByVisibleText(roomsNumber);
	}
	
	public void clickOnSearch(){
		searchButton.click();
	}
	
	public boolean checkTravelSelected() {
		
		return checkTravelWorkPurpose.isSelected();
	}
	
	public void checkTravel() {
		
		if(!checkTravelSelected()) {
			checkTravelWorkPurpose.click();
		}
	}
	
	public void checkFormMainText(){
		assertThat(formMainText.getText()).contains("Find Deals for Any Season");
	}
	
	public void checkPanelHeaderLoaded(){
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"top\"]/div")));
	}
	
	public void pressEsc() {

		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
	}
	
}