import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertTest extends setup {
    Alert alert;

    @BeforeMethod
    void setUpHome() {
        setupdriver("https://demoqa.com/alerts");
        alert = PageFactory.initElements(driver, Alert.class);

    }

    @Test
    void GetTitle() {
        System.out.println(driver.getTitle());
        Assert.assertTrue(true);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test
    void ClickbutonsCheck() {
        alert.Clickbutons();
        Assert.assertTrue(true);
        driver.quit();
    }







}