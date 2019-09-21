package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CuisinesPage extends TestBase {
//Page Factory
	@FindBy(xpath="//a[@class='addrecord btn btn-info']")
	WebElement AddRecord;
	
	@FindBy(id="tag_name")
	WebElement Tag;
	
	@FindBy(xpath="//input[@id='tag_image']")
	WebElement CuisineImage;
	
	@FindBy(id="jqSubmitForm")
	WebElement Save;
	//Initiliazing the P.O
	public CuisinesPage() {
		PageFactory.initElements(driver, this);
	}
	
public void AddCuisines(String TN,String CI) throws InterruptedException {
	AddRecord.click();
	Thread.sleep(3000);
	Tag.sendKeys(TN);
	Thread.sleep(3000);
	//upload
	CuisineImage.sendKeys(CI);
	Thread.sleep(3000);
	Save.click();
	Thread.sleep(3000);
}


}
