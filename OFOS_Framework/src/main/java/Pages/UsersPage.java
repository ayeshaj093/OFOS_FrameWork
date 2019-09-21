package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class UsersPage extends TestBase {
//Page Factory
	@FindBy(xpath="//a[@class='addrecord btn btn-info']")
	WebElement AddRecord;
	
	@FindBy(id="first_name")
	WebElement FirstName;
	
	@FindBy(id="last_name")
	WebElement LastName;

	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath="//select[@id='gender']/option[03]")
	WebElement Gender;
	
	@FindBy(xpath="//select[@id='status']/option[02]")
	WebElement Status;
	
	@FindBy(id="jqSubmitForm")
	WebElement Save;
	//Initializing the P.O
	public UsersPage() {
		PageFactory.initElements(driver, this);
	}
	public void AddUsers(String FN,String LN,String EMail,String Pwd) throws InterruptedException {
		AddRecord.click();
		Thread.sleep(3000);
		FirstName.sendKeys(FN);
		Thread.sleep(3000);
		LastName.sendKeys(LN);
		Thread.sleep(3000);
		Email.sendKeys(EMail);
		Thread.sleep(3000);
		Password.sendKeys(Pwd);
		Thread.sleep(3000);
		Gender.click();
		Thread.sleep(3000);
		Status.click();
		Thread.sleep(3000);
		Save.click();
		Thread.sleep(3000);
	}
}
