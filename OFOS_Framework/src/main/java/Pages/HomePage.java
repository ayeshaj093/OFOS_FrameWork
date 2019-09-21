package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase {
//restaurant
	@FindBy(xpath="//li[6]//a[1]")
	WebElement Restaurant;
	
	//couponcode
	@FindBy(xpath="//a[contains(text(),'Coupon Codes')]")
	WebElement CouponCode;
	
	//users
	@FindBy(xpath="//li[9]//a[1]")
	WebElement Users;
	
	//FoodItems
	@FindBy(xpath="//a[contains(text(),'Food Items')]")
	WebElement FoodItems;
	
	//Cuisines
	@FindBy(xpath="//a[contains(text(),'Cuisines')]")
	WebElement Cuisines;
	
	//Initializing the PageObjects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage ClickOnRestaurant() {
	  Restaurant.click();
	return new HomePage();
     }
	public HomePage ClickOnCouponCode() {
		CouponCode.click();
		return new HomePage();
	}
	public HomePage ClickOnUsers() {
	Users.click();
	return new HomePage();
	}
	public HomePage ClickOnFoodItems() {
		FoodItems.click();
		return new HomePage();
	}
	public HomePage ClickOnCuisines() {
		Cuisines.click();
		return new HomePage();
	}
}

