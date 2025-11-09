package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver ;

    private By ChooseFileButton = By.id("file-upload");
    private By UploadButton = By.id ("file-submit");
    private By UploadedFile = By.id("uploaded-files") ;

    public FileUploadPage(WebDriver driver)
    {
        this.driver = driver ;
    }

    public FileUploadPage uploadFile(String absoluteFilePath)
    {
        driver.findElement(ChooseFileButton).sendKeys(absoluteFilePath);
        return this;
    }

    public FileUploadPage ClickUploadButton()
    {
        driver.findElement(UploadButton).click();
        return this;
    }

    public String getUploadFileName()
    {
       return driver.findElement(UploadedFile).getText();
    }
}
