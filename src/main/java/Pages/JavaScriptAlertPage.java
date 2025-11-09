package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage {

    private WebDriver driver ;

    private By alertTriggerButton = By.xpath("//button[contains(.,\"Alert\")]") ;
    private By confirmTriggerutton = By.xpath("//button[contains(.,\"Confirm\")]") ;
    private By PromptTriggerButton = By.xpath("//button[contains(.,\"Prompt\")]");
    private By ResultText = By.id("result");

    public JavaScriptAlertPage(WebDriver driver) {
        this.driver = driver ;
    }

    public JavaScriptAlertPage TriggerAlert()
    {
        GetAlertTriggerButtonLocators(alertTriggerButton);
        return this ;
    }

    public JavaScriptAlertPage TriggerConfirm()
    {
        GetAlertTriggerButtonLocators(confirmTriggerutton);
        return this ;
    }

    public JavaScriptAlertPage TriggerPrompt()
    {
        GetAlertTriggerButtonLocators(PromptTriggerButton);
        return this;
    }
    public JavaScriptAlertPage alertClickToAccept()
    {
        driver.switchTo().alert().accept();
        return this;
    }

    public JavaScriptAlertPage alertClickToCancel()
    {
        driver.switchTo().alert().dismiss();
        return  this ;
    }

    public JavaScriptAlertPage alertSetText(String text)
    {
        driver.switchTo().alert().sendKeys(text);
        return this ;
    }

    public String alertGetText()
    {
        return driver.switchTo().alert().getText() ;
    }

    public String getResultText()
    {
       return driver.findElement(ResultText).getText() ;
    }
    private void GetAlertTriggerButtonLocators(By Button)
    {
        driver.findElement(Button).click();
    }

}
