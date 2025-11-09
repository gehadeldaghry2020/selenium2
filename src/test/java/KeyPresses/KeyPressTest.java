package KeyPresses;
import Pages.HomePage;
import Pages.KeyPressPage;
import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.security.Key;

import static org.testng.AssertJUnit.assertEquals;

public class KeyPressTest extends BaseTest {
    private KeyPressPage KeyPressPage ;
    private HomePage homePage ;
    String ExpectedText = "You entered: A";

    @BeforeMethod
    public void setKeyPressPage()
    {
        homePage = new  HomePage(driver);
        KeyPressPage = new KeyPressPage(driver);
//        homePage.ClickKeyPresses();

    }

    @Test
    public void testBackSpace()
    {
        KeyPressPage.setText(Keys.chord("A"));
        Assert.assertEquals(KeyPressPage.getText(),ExpectedText, "Hello");

    }
}
