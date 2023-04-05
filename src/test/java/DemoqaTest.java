import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoqaTest extends setup{
    Demoqa demoqa;

    @BeforeMethod
    void setUpHome() {
        setupdriver("https://demoqa.com/browser-windows");
        demoqa = PageFactory.initElements(driver, Demoqa.class);

    }

    @Test
    void GetTitle() {
        System.out.println(driver.getTitle());
        Assert.assertTrue(true);
    }


    @Test
    void windowhandlingTest(){
        demoqa.presentTab();
        windowHandle(driver);
        Assert.assertTrue(demoqa.secondTabPage());
    }
    @Test
    void windowhandlingTests() {
        demoqa.newWindowPage();
        windowHandle(driver);
        Assert.assertTrue(demoqa.secondTabPage());
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
    }




}
