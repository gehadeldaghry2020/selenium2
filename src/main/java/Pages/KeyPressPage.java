package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {

    private WebDriver driver ;
    private By inputField = By.id("target");
    private By resultMessage = By.id("result");

    public KeyPressPage(WebDriver driver)
    {
        this.driver = driver ;
    }

    public void setText(String Text )
    {
        driver.findElement(inputField).sendKeys(Text);
    }

    public String  getText ()
    {
       return driver.findElement(resultMessage).getText();
    }

}
