package TestCASES;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RestaurantPage;

public class RestaurantPageTest extends TestBase {
//  private static final String String = null;
  LoginPage loginPage;
  HomePage homePage;
  RestaurantPage restaurantPage;
  
  
  public RestaurantPageTest() {
	  super();
  }
  
  @BeforeMethod
  public void setup() throws InterruptedException {
	  initialization();
	  loginPage  = new LoginPage();
	  homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
  }
//  @Test(priority=0)
//  public void AddRestaurant() throws InterruptedException {
//	  homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//	  Thread.sleep(3000);
//	  homePage = homePage.ClickOnRestaurant();
//	  Thread.sleep(3000);
//  }
  @Test(priority=1)
  public void Restaurant() throws InterruptedException {
	  
	  homePage = homePage.ClickOnRestaurant();
	  Thread.sleep(3000);
	  restaurantPage = new RestaurantPage();
	  Thread.sleep(3000);
	  restaurantPage.AddRestaurant("Cafe2", "Cafe2","12-Churchs-treet-Chicago", "123456","9874563210","Italian","abc","abc@gmail.com","50","2","2","1");
	  Thread.sleep(3000);
  }
}

