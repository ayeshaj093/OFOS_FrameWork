package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CouponCodePage extends TestBase {
//Page Factory
	@FindBy(xpath="//a[@class='addrecord btn btn-info']")
	WebElement AddRecord;
	
	@FindBy(id="ccCode")
	WebElement CCode;
	
	@FindBy(id="ccDescription")
	WebElement Description;
	
	@FindBy(id="ccDiscount")
	WebElement Discount;
	
	@FindBy(id="ccNumberOfImpression")
	WebElement Impressions;
	
	@FindBy(id="jqSubmitForm")
	WebElement Save;
	
	//Initializing the P.O
	public CouponCodePage() {
		PageFactory.initElements(driver, this);
	}
public void AddCouponCode(String CC,String DES,String Disc, String Imp) throws InterruptedException {
	AddRecord.click();
	Thread.sleep(3000);
	CCode.sendKeys(CC);
	Thread.sleep(3000);
	Description.sendKeys(DES);
	Thread.sleep(3000);
	Discount.sendKeys(Disc);
	Thread.sleep(3000);
	Impressions.sendKeys(Imp);
	Thread.sleep(3000);
	Save.click();
	Thread.sleep(3000);
	
	
}
}