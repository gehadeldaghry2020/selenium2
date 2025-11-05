package dropdown;

import Pages.HomePage;
import Pages.dropdownpage;
import base.BaseTest;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {
    private dropdownpage dropdownpage;
    private HomePage homePage ;

    @Test
    public void testDropdown ()
    {
        homePage = new HomePage(driver);
        dropdownpage = new dropdownpage(driver) ;

        homePage.ClickDropDown();
        dropdownpage.selectfromdropdownoptions("Option 2") ;



    }
}
