package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {

    private WebDriver driver ;

    private By username = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.cssSelector("button.radius");



    //locators
//    @FindBy(id = "username")
//    private By username  ;
//
//    @FindBy(id = "password")
//    private By password ;
//
//    @FindBy (css =  "#login > button ")
//    private By log_button ;

    //constructor
    public  LoginPage (WebDriver driver )
    {
        this.driver = driver ;
//        org.openqa.selenium.support.PageFactory.initElements(driver, this); // مهم جدًا

    }

    //methods
    //type username
    public void enterusername(String user)
    {
        driver.findElement(username).sendKeys(user);
    }
    //type password
    public void enterpassword(String pass)
    {
        driver.findElement(password).sendKeys(pass);
    }

    public void clicklogin()
    {
        driver.findElement(loginButton).click();
    }
}
