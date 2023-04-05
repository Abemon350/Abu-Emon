import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Demoqa extends setup{
    @FindBy(xpath = "//button[@id='tabButton']")
    WebElement tab;

    void presentTab() {
        tab.click();
    }
    @FindBy(xpath ="//h1[@id='sampleHeading']")
    WebElement secondTab;
    boolean secondTabPage(){
        return secondTab.isDisplayed();
    }
    @FindBy(xpath = "//button[@id='windowButton']")
    WebElement newwindow;
    void newWindowPage(){
        newwindow.click();
    }




}
