package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class RestaurantPage extends TestBase{
//Page Factory
	@FindBy(xpath= "//a[contains(@class,'addrecord btn btn-info')]")
    WebElement AddRecord;
	
	@FindBy(xpath="//input[@id='venue_name']")
	WebElement RestaurantName;
	
	@FindBy(xpath="//textarea[@id='venue_description']")
	WebElement Description;
	
	@FindBy(id="venue_address_by_user")
	WebElement Address;
	
	@FindBy(xpath="//input[@id='zip_code']")
	WebElement Zipcode;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement Phone;
	
	@FindBy(id="tags")
	WebElement Cuisines;
	
	//radio_button
	@FindBy(xpath="//label[2]//input[1]")
	WebElement PaymentOption;
	
	//checkbox
	@FindBy(id="takout")
	WebElement Takout;
	
	//dropdown
	@FindBy(xpath="//select[@id='created_by']/option[03]")
	WebElement RestaurantOwner;
	
	@FindBy(id="store_manager")
	WebElement Manager;
	
	@FindBy(id="store_manager_email")
	WebElement ManagerEmail;
	
	@FindBy(id="min_order_amount")
	WebElement MinOrderAmount;
	
	@FindBy(id="sales_tax")
	WebElement SalesTax;
	
	@FindBy(id="delivery_fee")
	WebElement DeliveryFee;
	
	@FindBy(id="commission")
	WebElement Commission;
	
	@FindBy(id="jqSubmitForm")
	WebElement Save;
	
	//initializing P.O
	public RestaurantPage() {
		PageFactory.initElements(driver, this);
	}
public void AddRestaurant(String RN,String DES,String ADD,String ZIP,String PHONE,String CUIS,String MNGR, String MngrEmail,String MINORDR,String DELFEE,String SALESTAX, String COMMSN ) throws InterruptedException {
	AddRecord.click();
	Thread.sleep(3000);
	RestaurantName.sendKeys(RN);
	Thread.sleep(3000);
	Description.sendKeys(DES);
	Thread.sleep(3000);
	Address.sendKeys(ADD);
	Thread.sleep(3000);
	Zipcode.sendKeys(ZIP);
	Thread.sleep(3000);
	Phone.sendKeys(PHONE);
	Thread.sleep(3000);
	Cuisines.sendKeys(CUIS);
	Thread.sleep(3000);
	PaymentOption.click();
	Thread.sleep(3000);
	Takout.click();
	Thread.sleep(3000);
	//scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(500, 600)");
		Thread.sleep(3000);
	RestaurantOwner.click();
	Thread.sleep(3000);
	Manager.sendKeys(MNGR);
	Thread.sleep(3000);
//	//scrolldown
//		JavascriptExecutor js1=(JavascriptExecutor)driver;
//		js1.executeScript("window.scrollBy(1200, 2200)");
//		Thread.sleep(3000);
	ManagerEmail.sendKeys(MngrEmail);
	Thread.sleep(3000);
	MinOrderAmount.sendKeys(MINORDR);
	Thread.sleep(3000);
	SalesTax.sendKeys(DELFEE);
	Thread.sleep(3000);
	DeliveryFee.sendKeys(SALESTAX);
	Thread.sleep(3000);
	Commission.sendKeys(COMMSN);
	Thread.sleep(3000);
	Save.click();
	Thread.sleep(3000);
	

}

}
