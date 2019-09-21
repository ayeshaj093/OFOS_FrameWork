package TestCASES;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.FoodItemsPage;
import Pages.HomePage;
import Pages.LoginPage;

public class FoodItemsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	FoodItemsPage fooditemsPage;
	
	public FoodItemsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPage = new LoginPage() ;
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
@Test
public void FoodItems() throws InterruptedException {
	
	homePage = homePage.ClickOnFoodItems();
	Thread.sleep(3000);
	fooditemsPage= new FoodItemsPage();
	Thread.sleep(3000);
	fooditemsPage.AddFoodItem("Chilly Chicken");
	Thread.sleep(3000);
}
}
