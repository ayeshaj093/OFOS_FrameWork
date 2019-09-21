package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class FoodItemsPage extends TestBase {
 //Page Factory
	@FindBy(xpath="//a[@class='addrecord btn btn-info']")
	WebElement AddRecord;
	
	@FindBy(id="activity_name")
	WebElement FoodItem;
	
	@FindBy(id="jqSubmitForm")
	WebElement Save;
	//Initializing the P.O
	public FoodItemsPage() {
		PageFactory.initElements(driver, this);
	}
	
public void AddFoodItem(String Food) throws InterruptedException {
	AddRecord.click();
	Thread.sleep(3000);
	FoodItem.sendKeys(Food);
	Thread.sleep(3000);
	Save.click();
	Thread.sleep(3000);
}
}
