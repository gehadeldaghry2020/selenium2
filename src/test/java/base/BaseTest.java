package base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver ;
    private HomePage homePage ;

    @BeforeTest
    public void SetUp()
    {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");


    }
    public void goHome ()
    {
        homePage = new HomePage(driver);

    }

}
