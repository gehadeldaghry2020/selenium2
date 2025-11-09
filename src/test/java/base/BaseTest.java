package base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeMethod
    public void setUp() {
        // 1️⃣ افتحي المتصفح وادخلي على الموقع
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        // 2️⃣ اعملي initialize للـ HomePage باستخدام نفس الـ driver
        homePage = new HomePage(driver);
    }

//    @AfterMethod
//    public void tearDown() {
//        // 3️⃣ اقفلي المتصفح بعد كل test
//        if (driver != null) {
//            driver.quit();
//        }

}
