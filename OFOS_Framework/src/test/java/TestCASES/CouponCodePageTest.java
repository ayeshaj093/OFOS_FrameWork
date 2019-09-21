package TestCASES;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CouponCodePage;
import Pages.HomePage;
import Pages.LoginPage;

public class CouponCodePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	CouponCodePage couponcodePage;
	
	public CouponCodePageTest() {
		super();
		
	}
	
@BeforeMethod
	public void setup() throws InterruptedException {
	initialization();
	loginPage = new LoginPage();
	homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
}

@Test
public void CC() throws InterruptedException {
	
	homePage=homePage.ClickOnCouponCode();
	Thread.sleep(3000);
	couponcodePage = new CouponCodePage();
	couponcodePage.AddCouponCode("CC10", "CC10", "10", "12");
	Thread.sleep(3000);
}
}
