package AutomationTestOnOnePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision {
    static WebDriver driver ;

    public static void main(String[] args) {
        driver = new ChromeDriver();

        driver.navigate().to("https://the-internet.herokuapp.com/");
//        driver.quit(); // close browser from taskbar
//        driver.close(); // close browser but the session still work


//        driver.getTitle();
//        String Tittle = driver.getTitle();
//        System.out.println(Tittle);
//
//        driver.quit();

//        driver.manage().window().fullscreen();  // to show the website in the full Screen

        driver.findElement(By.xpath("//li/a[@href=\"/login\"]  ")).click();

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//*[@class=\"fa fa-2x fa-sign-in\"]")).click();
//        driver.quit();




    }
}
