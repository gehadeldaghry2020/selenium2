package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class dropdownpage {

    private WebDriver driver ;
    private By dropdown = By.id("dropdown");


    public dropdownpage(WebDriver driver)
    {
        this.driver = driver ;
    }
    public dropdownpage selectfromdropdownoptions (String option)
    {
        findDropDownElement().selectByVisibleText(option);
        return this ;
    }

    public List<String> getselectoptions()
    {
        List<WebElement> optionsElements = findDropDownElement().getAllSelectedOptions();
        List<String> optiontext = new ArrayList<>() ;
        for (WebElement element:optionsElements)
        {
            optiontext.add(element.getText());
        }
        return optiontext ;
    }

    private Select findDropDownElement() {
        return new Select(driver.findElement(dropdown)) ;
    }
}