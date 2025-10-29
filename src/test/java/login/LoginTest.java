package login;

import Pages.LoginPage;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    private WebDriver driver ;
    private LoginPage loginpage ;

    String username = "tomsmith" ;
    String password = "SuperSecretPassword!" ;

    @BeforeTest
    public void setUpLoginPage() {
        driver = new ChromeDriver(); // أو خدي نفس الـ driver من BaseTest
        driver.get("https://the-internet.herokuapp.com/login");
        loginpage = new LoginPage(driver); // ✅ كده بقى initialized
    }

    @Test
    public void loginForm ()
    {
        loginpage.enterusername(username);
        loginpage.enterpassword(password);
        loginpage.clicklogin();
    }
}
