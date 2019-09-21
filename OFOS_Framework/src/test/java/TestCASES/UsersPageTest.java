package TestCASES;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.UsersPage;

public class UsersPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	UsersPage usersPage;
	
	public UsersPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPage= new LoginPage();
		homePage=loginPage.login(prop.getProperty("password"), prop.getProperty("password"));  
	}
	
	@Test
	public void Users() throws InterruptedException {
		
		homePage= homePage.ClickOnUsers();
		Thread.sleep(3000);
		usersPage = new UsersPage();
		Thread.sleep(3000);
		usersPage.AddUsers("A", "J", "abc@gmail.com", "abc123");
		Thread.sleep(3000);
	}
}
