import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testpage extends setup {
    homepage home;
    @BeforeMethod
    void setuptest(){
        setupdriver("https://ebay.com");
        home  = PageFactory.initElements(driver,homepage.class);

    }
    @Test
    void smarttest(){
        String Actualtext= home.smarttext();
        Assert.assertEquals(Actualtext,"Smart home");
    }
    @Test
    void  c1(){
        Assert.assertTrue(home.c());
    }
}
