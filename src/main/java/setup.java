import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class setup {
    WebDriver driver;
    Actions actions;

    void setupdriver(String url) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }
    void selectDropdown(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

//   void moveMouse(WebElement dr,WebElement element){
//       Actions actions=new Actions(driver);
//       actions.moveToElement(element).perform();
//   }
    void moveMouse(WebDriver dr, WebElement element) {
        Actions actions = new Actions(dr);
        actions.moveToElement(element).perform();
    }
    void windowHandle(WebDriver dr) {
        Set<String> otherWindow = dr.getWindowHandles();
        String currentWindow = dr.getWindowHandle();

        for (String s : otherWindow) {
            if (s != currentWindow) {
                dr.switchTo().window(s);
            }
        }
    }

        void doubleclick(WebDriver dr, WebElement element){
        Actions actions= new Actions(dr);
        actions.doubleClick().perform();
       }
      void ScrollDown(WebDriver dr, String script) {
        JavascriptExecutor js = ((JavascriptExecutor) dr);
        js.executeScript(script);
    }
    void babu(WebDriver dtt,int time,WebElement element){
        WebDriverWait wait=new WebDriverWait(dtt,time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    void babu1(WebDriver dtt,int time,WebElement element){
        WebDriverWait wait=new WebDriverWait(dtt,time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    void doubleClick(WebDriver dr, WebElement element) {
        Actions actions = new Actions(dr);
        actions.moveToElement(element).perform();
    }

    private void action1(WebDriver dr) {
        actions = new Actions(dr);
    }


    void quitBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }









}