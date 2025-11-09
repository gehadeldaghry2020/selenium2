package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private WebDriver driver ;



    // constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver ;
    }

    //methods

//    public void clickFormAuth()
//    {
//        Clicklink("Form Authentication");
//    }
//
//    public void ClickDropDown ()
//    {
//        Clicklink("DropDown");
//    }

//    public void JavaScriptAlert()
//    {
//        Clicklink("JavaScript Alerts");
//    }

//    public void ClickKeyPresses()
//    {
//        Clicklink("Key Presses");
//    }

    public void ClickFileUpload()
    {
        Clicklink("File Upload");
    }

    private void Clicklink (String linktext)
    {
        driver.findElement(By.linkText(linktext)).click();
    }


}
