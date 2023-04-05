import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Testpage extends setup {
    homepage home;
    @BeforeMethod
    void setUpTest() throws InterruptedException {
        setupdriver("https://ebay.com");
        home  = PageFactory.initElements(driver,homepage.class);
    }
    @Test
    void  c1(){
        Assert.assertTrue(home.c());
    }
    @Test
    void Testtoys(){
        home.clicktoys();
        String actualurl=driver.getCurrentUrl();
        Assert.assertEquals(actualurl,"https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497");
    }
    @Test
  void Testsearch(){
        home.clicksearch();
        String actualurl=driver.getCurrentUrl();
        Assert.assertEquals(actualurl,"https://www.ebay.com/sch/i.html?_nkw=smart+home+kit&_sop=12");
  }

@Test
    void clickHelper(){
        home.clickHelperLinks(driver);
}
  @Test
    void ebayLogo1(){
        Assert.assertTrue(home.checkLogo());
  }
@Test
    void testtopdeal(){
        String actualText=home.dealsText();
        Assert.assertEquals(actualText,
                "Today's Deals – All With Free Shipping");
}
@Test
    void allCategory() throws InterruptedException {
        home.selectCategory();
        Thread.sleep(12000);}
        @Test
        void testMotor(){
            home.clickMotor();
            String actualUrl=driver.getCurrentUrl();
            Assert.assertEquals(actualUrl,"https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334");
    }
    @Test
    void testJewlryWatche(){
        home.clickJewlryWatche1();
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.ebay.com/b/Jewelry-Watches/281/bn_1865273");
    }
    @Test
    void testSingnIntext(){
        home.singin();
        String actual=home.singIn.getText();
        Assert.assertEquals(actual,"Sign in");
    }
//    @Test
//     void testheaderlinks(){
//     ArrayList<String> expect= new ArrayList<>();
//     expect.add("home");
//     expect.add("save");
//     expect.add("motor");
//     expect.add("electronics");
//     expect.add("Collectibles");
//     Assert.assertEquals (home.headerlinks,expect);
// }
       @Test
       void test(){
            home.cartpage();
            String actualUrl=driver.getCurrentUrl();
            driver.quit();
      }
      @Test
    void test1(){
        home.shoppage();
        String actualUrl=driver.getCurrentUrl();
        driver.quit();
      }
      @Test
    void test2(){
        home.listpage();
        String actualUrl=driver.getCurrentUrl();
        driver.quit();
      }
      @Test
      void test3(){
        home.Fashionpage();
        String actualUrl=driver.getCurrentUrl();
        driver.quit();
      }
     @Test
    void test4(){
        home.Homepage();
        String actualUrl=driver.getCurrentUrl();
        driver.quit();
     }
     @Test
    void test5(){
        home.Sportingpage();
        String actualUrl=driver.getCurrentUrl();
        driver.quit();
     }
     @Test
     void test6(){
        home.Businesspage();
        String actualUrl=driver.getCurrentUrl();
        driver.quit();
     }
    @Test
    void test7(){
        home.Seeallpage();
        String actualUrl=driver.getCurrentUrl();
        driver.quit();
    }
    @Test
    void test8(){
        home.Championpage();
        String actualUrl=driver.getCurrentUrl();
        driver.quit();
    }
    @Test
    void test9() throws InterruptedException {
        home.Advancedpage();
        String actualUrl=driver.getCurrentUrl();
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    void testcopyRight() throws InterruptedException {
       Assert.assertTrue(home.checkcopyRight());
        Thread.sleep(2000);
        driver.quit();
    }
//    @Test
//    void testcopyRighttext(){
//        Assert.assertTrue(home.copyRighttext(  driver).contains("2023"));
//    }

    @Test void facebooktest() throws InterruptedException {
        home.Facebookpage();
        String actualUrl=driver.getCurrentUrl();
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    void addtest() throws InterruptedException {
        home.AddPage(driver);
        Assert.assertFalse(driver.getCurrentUrl().contains("https://www.ebay.com/deals?_trkparms=meid_vp%3D8a1d9717a286476a88de210e8d7b3968"));
        Thread.sleep(2000);
        driver.quit();
    }
//   @Test
//    void NumberofLink(){
//        int number = home.NumberofLink.getSize();
//        Assert.assertEquals(number,5);
//   }

    @Test
    void sitMaptest() throws InterruptedException {
        home.sitmappage();
        String actualUrl=driver.getCurrentUrl();
        Thread.sleep(2000);
        driver.quit();
    }
//    @Test
//    void eBayBuyer(){
//        home.eBayBuylink();
//    }
    @Test
    void validsportingt() throws InterruptedException {
    boolean a = home.checksportingpage(driver);
    Assert.assertTrue(a);
    Thread.sleep(5000);
    driver.quit();
   }
    @Test
    void checksprotingpage() {
        Assert.assertFalse(home.checksportingpage1(driver).contains("bikes"));
        driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);
        driver.quit();

    }
    @Test
    void checksearchbar() throws InterruptedException {
        home.Searchbar.sendKeys("flower");
        Thread.sleep(4000);
    }
    @Test
    void vaildcompneytest() throws InterruptedException {
        Assert.assertFalse(driver.getCurrentUrl().equals("https://eBay.com"));
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    void checksearchbar1() throws InterruptedException {
        home.Searchbar.sendKeys("iphone11");
        Thread.sleep(4000);
        driver.quit();
    }
    @Test
    void sellaccount(){
        Assert.assertTrue(home.checksell());
    }
    @Test
    void  eBayReturnstest() throws InterruptedException {
        String actualText=home.eBayReturnspage();
        Thread.sleep(1000);
        Assert.assertEquals(actualText,
                "eBay Returns");
        driver.quit();
    }
    @Test
    void vaildcookwear(){
        Assert.assertTrue(home.checkcookwear());
        driver.quit();
    }
    @Test
    void clickcookweartest(){
        home.clickcookwear();
        String actualUrl=driver.getCurrentUrl();
        driver.quit();
    }
    @Test
    void  Cookweartext1(){
        String actualText=home.cookweartext();
        Assert.assertEquals(actualText,
                        "Cookware");
        driver.quit();
    }
    @Test
    void checkcoupon(){
        Assert.assertTrue(home.checkgetcoupon());
        driver.quit();
    }
    @Test
    void scrolldowntest() throws InterruptedException {
        ScrollDown(driver, "window.scroll(0,7000)");
        String actualUrl = driver.getCurrentUrl();
        Thread.sleep(3000);
        driver.quit();
    }
    @Test void checkcareepage() throws InterruptedException {
        Assert.assertTrue(home.checkcareers());
        Thread.sleep(3000);
        driver.quit();
    }
    @Test void Careertext() throws InterruptedException {
        String actualText=home.careertext();
        Thread.sleep(2000);
        Assert.assertEquals(actualText,"Careers");
        Thread.sleep(2000);
        driver.quit();
    }
    @Test void Clickcareer() {
        home.checkcareers();
        String actualUrl=driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        driver.quit();
    }






}
