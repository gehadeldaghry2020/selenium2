package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private WebDriver driver ;

    // locators
     @FindBy(xpath ="//*[@id=\"content\"]/ul/li[21]/a")
     private WebElement FormAuth ;

    // constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver ;
    }

    //methods

    public void clickAuth()
    {
        FormAuth.click();
    }
}
