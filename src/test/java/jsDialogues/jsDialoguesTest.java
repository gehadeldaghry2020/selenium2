package jsDialogues;

import Pages.HomePage;
import Pages.JavaScriptAlertPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class jsDialoguesTest extends BaseTest {

    private HomePage homePage ;
    private JavaScriptAlertPage javaScriptAlertPage ;
    String resulttext ;

    @Test
    public void TestAlert()
    {
        homePage = new HomePage(driver);
        javaScriptAlertPage = new JavaScriptAlertPage(driver);
        resulttext = "You successfully clicked an alert" ;

//        homePage.JavaScriptAlert();
        javaScriptAlertPage.TriggerAlert().alertClickToAccept() ;
        assertEquals(javaScriptAlertPage.getResultText() , resulttext,"The Text is Incorrect");
    }

    @Test
    public void TestConfirm()
    {
        homePage = new HomePage(driver);
        javaScriptAlertPage = new JavaScriptAlertPage(driver);
        resulttext = "I am a JS Confirm" ;


//        homePage.JavaScriptAlert();
        javaScriptAlertPage.TriggerConfirm();
        assertEquals(javaScriptAlertPage.alertGetText(),resulttext,"Hello Error" );
        javaScriptAlertPage.alertClickToAccept();
    }

    @Test
    public void TestPrompt()
    {
        homePage = new HomePage(driver);
        javaScriptAlertPage = new JavaScriptAlertPage(driver);
        String Text ="Jehad" ;
        resulttext ="I am a JS prompt";
//        homePage.JavaScriptAlert();
        javaScriptAlertPage.TriggerPrompt();
        javaScriptAlertPage.alertSetText(Text);
        assertEquals(javaScriptAlertPage.alertGetText(),resulttext,"Hello Error Goga");
        javaScriptAlertPage.alertClickToAccept();
        assertTrue(javaScriptAlertPage.getResultText().contains(Text),"Hello");


    }
}
