package FileUpload;

import Pages.FileUploadPage;
import Pages.HomePage;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class fileUploadTest extends BaseTest {
//    private WebDriver driver ;
    private FileUploadPage fileUploadPage ;
    private HomePage homePage;
    String fileName ;

    @BeforeMethod
    public void setFileUploadPage()
    {
        homePage = new HomePage(driver);
        fileUploadPage = new FileUploadPage(driver);
    }

    @Test
    public void testFileUpload()
    {
        fileName = "jehad.txt";
        String filepath = "D:\\Software Testing\\Java\\selenium2\\Resourses\\jehad.txt" ;

        homePage.ClickFileUpload();

        fileUploadPage.uploadFile(filepath).ClickUploadButton();
        Assert.assertEquals(fileUploadPage.getUploadFileName() , fileName ,"Errors");
    }
}
