package TestCASES;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CuisinesPage;
import Pages.HomePage;
import Pages.LoginPage;

public class CuisinesPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CuisinesPage cuisinesPage;
	
	public CuisinesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPage= new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@Test
	public void Adds() throws InterruptedException {
		
		homePage = homePage.ClickOnCuisines();
		Thread.sleep(3000);
		cuisinesPage = new CuisinesPage();
		Thread.sleep(3000);
//		cuisinesPage.AddCuisines(TN,CI);
		cuisinesPage.AddCuisines("Arabian", "C:\\Users\\Ayesha\\Downloads\\indian food.jpg");
		Thread.sleep(3000);
	}
}
