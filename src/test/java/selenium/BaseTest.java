package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class BaseTest {
    static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) {
        WebDriver driver ;
        driver = new ChromeDriver();
//        driver.navigate().to("https://the-internet.herokuapp.com/"); // دا علشان اخلي الويبسات يفتح لوحده
//        driver.getTitle();  // علشان اجيب التايتل بتاع البيدج ال هفتحها
//        String title = driver.getTitle();  // (F11) هستقبل التايتل فى متغير علشان اعرف اطبعه
//
//        driver.manage().window().fullscreen(); //  علشان السيشن ترن فى اسكرين كاملة
//        // driver.manage().window().setSize(new Dimension(350 , 500)); // علشان يرن المتصفح برتفاع وعرض معينين
//        System.out.println(title);  // طبعته
//        //driver.quit();
//        //*********************************************************************************************************//
//        // انا دلوقتى عاوزاه يعمل click اى الحل ؟
//
//        // driver.findElements(By.xpath(div/a/strong [text()='English']));
//
//        // دا النص الغلط خليه علشان تعرفى غلطاتك بعد كدا
//        // WebElement input = driver.findElements(By.xpath(div/a/strong [text()='English']));
//
//        WebElement input = driver.findElement(By.xpath("//div/a/strong[text()='English']"));
//        input.click();
//
//        //**********************************************************************************************************//
//
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//    }
//
//    public static WebElement getInput(int i) {
//        return driver.findElement(By.xpath("(//input)[" + i + "]"));

//     ************************************************** Session 2 *************************************************/
//              انا هنا عاوزه افتح المتصفح الاول وبعدين ادخل على ال input وبعدين ااخليه يكتب فيه اليوز نيم والباسورد وبعدين ويدوس لوجن
//     *************************************************************************************************************//

        driver.navigate().to("https://the-internet.herokuapp.com/"); // دا علشان اخلي الويبسات يفتح

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[27]/a")).click(); // علشان افتح اللينك بتاع input
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input")).sendKeys("1");
        // دا علشان اكتب جوه ال input  رقم او اسم معين


    }

}


