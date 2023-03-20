import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class homepage {

    @FindBy(xpath = "//*[@id=\"destinations_list2\"]/ul/li[4]/a/div[2]")
    WebElement smart;

    boolean c() {
        return smart.isDisplayed();
    }
    String smarttext(){
        return smart.getText();

    }
    @FindBy(xpath ="//div[@id=\"qRdwfOCBq5te_ZOaz0D9bw\"]/div[1]")
    WebElement Thewarm;
    String Thewarmtext(){
        return Thewarm.getText();
    }
}
