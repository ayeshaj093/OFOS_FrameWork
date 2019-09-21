package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {

	//Page factory
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='inputPassword']")
	WebElement password;
	
	@FindBy(xpath="//button[@name='submit']")
	WebElement loginBtn;
	
	//initializing the PageObjects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String un, String pwd) throws InterruptedException {
	username.sendKeys(un);
	Thread.sleep(3000);
	password.sendKeys(pwd);
	Thread.sleep(3000);
    loginBtn.click();
    Thread.sleep(3000);
    
    return new HomePage();
}
}
