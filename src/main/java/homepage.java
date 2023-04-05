import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class homepage extends setup {

    @FindBy(xpath = "//*[@id=\"destinations_list2\"]/ul/li[4]/a/div[2]")
    WebElement smart;
    @FindBy(xpath = "//ul[@class=\"hl-cat-nav__container\"]/li[8]")
    WebElement toys;
    @FindBy(css = "[placeholder=\"Search for anything\"]")
    WebElement search;
    @FindBy(xpath = "//li[@id=\"gh-p-3\"]")
    List<WebElement> helperlink;
    @FindBy(xpath = "//*[@id=\"gh-la\"]")
    WebElement ebayLogo;
    @FindBy(xpath = "//*[@id=\"items_list1\"]/div[1]/div/div[1]/h2/a")
    WebElement Topdeal;
    @FindBy(xpath = "//select[@aria-label=\"Select a category for search\"]")
    WebElement category;
    @FindBy(xpath = "//div[@class=\"hl-cat-nav\"]/ul/li[3]")
    WebElement motors;
    @FindBy(xpath = "//ul[@class=\"hl-cat-nav__container\"]/li[11]")
    WebElement jewlryWatches;
    @FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
    WebElement singIn;
    @FindBy(xpath = "//div[@class=\"hl-cat-nav\"]/ul/li")
    Set<WebElement> headerlinks;
    @FindBy(css = "[class=\"gh-cart-icon\"]")
    WebElement cart;
    @FindBy(xpath = "//div[@id=\"gh-shop\"]")
    WebElement shop;
    @FindBy(css = "[title=\"Watchlist\"]")
    WebElement list;
    @FindBy(xpath = "//ul[@class=\"hl-cat-nav__container\"]/li[7]")
    WebElement fashion;
    @FindBy(xpath = "//ul[@class=\"hl-cat-nav__container\"]/li[6]")
    WebElement Home;
    @FindBy(xpath = "//ul[@class=\"hl-cat-nav__container\"]/li[9]")
    WebElement Sporting;
    @FindBy(xpath = "//ul[@class=\"hl-cat-nav__container\"]/li[10]")
    WebElement Business;
    @FindBy(xpath = "//div[@id=\"destinations_list1\"]/div/div/div[2]/a")
    WebElement Seeall;
    @FindBy(xpath = "//*[@id=\"destinations_list2\"]/ul/li[1]/a/div[2]")
    WebElement Champion;
    @FindBy(css = "[aria-label=\"Advanced Search\"]")
    WebElement Advanced;
    //    @FindBy(xpath = "//select[@aria-label=\"Select a category for search\"]")
//    WebElement  Allcategories;
//
//    @FindBy(css = "[class=\"gf-legal\"]")
//    WebElement copyRight;
//    @
    @FindBy(xpath = "//footer[@class=\"gh-w\"]/div[3]/table/tbody/tr[2]/td[1]")
    WebElement copyRight;
    @FindBy(xpath = "//div[@class=\"gffoot\"]/table/tbody/tr/td[3]/ul/li/link")
    WebElement FaceBook;
    @FindBy(xpath = "//*[@id=\"ads_combo3\"]/a/div[1]/div/div")
    WebElement Add;
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td")
    WebElement NumberofLink;
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul[2]/li[3]/a")
    WebElement sitmap;
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td")
    WebElement eBayBuyerlinkcheck;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a")
    WebElement sporting;
    @FindBy(css = "[placeholder=\"Search for anything\"]")
    WebElement Searchbar;
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[1]/a")
    WebElement Compney;
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/h3[1]/a")
    WebElement Selltopick;
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul[1]/li[3]/a")
    WebElement eBayReturns;
    @FindBy(xpath = "//*[@id=\"destinations_list2\"]/ul/li[4]/a/div[1]/div/div")
    WebElement Cookwear;
    @FindBy(xpath = "//*[@id=\"destinations_list2\"]/ul/li[4]/a/div[2]")
    WebElement cookwear;
    @FindBy(xpath = "//*[@id=\"s0-0-33-4-0-0[0]-2-match-media-0-ebay-carousel-list\"]/li[1]/div/div/div[1]/div[2]/a/div[2]")
    WebElement getcoupon;
    @FindBy(css = "[id=\"gh-cat\"]")
    WebElement scrolldown;
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[4]/a")
    WebElement careers;





    boolean c() {
        return smart.isDisplayed();
    }
    void clicktoys() {
        toys.click();
    }
    void clicksearch() {
        search.click();
    }
    void clickHelperLinks(WebDriver dr) {
        for (WebElement x : helperlink) {
            x.click();
        }
    }
    boolean checkLogo() {
        return ebayLogo.isDisplayed();
    }
    String dealsText() {
        return Topdeal.getText();
    }
    void selectCategory() {
        selectDropdown(category, 5);
    }
    void clickMotor() {
        motors.click();
    }
    void clickJewlryWatche1() {
        jewlryWatches.click();
    }
    boolean singin() {
        return singIn.isDisplayed();
    }
    ArrayList<String> header() {
        ArrayList<String> elments = new ArrayList<>();
        for (WebElement x : headerlinks) {
            elments.add(x.getText());
        }
        return elments;
    }
    void cartpage() {
        cart.click();
    }
    void shoppage() {
        shop.click();
    }
    void listpage() {
        list.click();
    }
    void Fashionpage() {
        fashion.click();
    }
    void Homepage() {
        Home.click();
    }
    void Sportingpage() {
        Sporting.click();
    }
    void Businesspage() {
        Business.click();
    }
    void Seeallpage() {
        Seeall.click();
    }
    void Championpage() {
        Champion.click();
    }
    void Advancedpage() {
        Advanced.click();
    }
    boolean checkcopyRight() {
        return copyRight.isDisplayed();
    }
//    String copyRighttext(WebDriver dr1 ){
//        moveMouse(dr1,copyRight);
//        return copyRight.getText();
//    }
    String copyRighttext(WebElement dr1) {
        moveMouse((WebDriver) dr1, copyRight);
        return copyRight.getText();
    }
    void Facebookpage() {
        FaceBook.click();
    }
    void AddPage(WebDriver dr) {
        doubleclick(dr, Add);
    }
//    ArrayList<String> linkText(){
//        ArrayList<String> text = new ArrayList<>();
//        for (WebElement x : NumberofLink){ text.add(x.getText());
//        }
//        return text;
//    }
    void sitmappage() {
        sitmap.click();
    }
    //    void eBayBuylink(){
//        for (WebElement x:eBayBuyerlinkcheck ){
//            x.click();
//            driver.navigate().back();
//        }
    boolean checksportingpage(WebDriver dr1) {
        moveMouse(dr1, sporting);
        boolean copy = sporting.isDisplayed();
        return copy;
    }
    String checksportingpage1(WebDriver dr1) {
        moveMouse(dr1, sporting);
        return sporting.getText();
    }
    void checksearchbar() {
        Searchbar.click();
    }
    void validcompney(WebDriver dr) {
        doubleClick(dr, Compney);
    }
    boolean checksell() {
        return Selltopick.isDisplayed();
    }
    String eBayReturnspage() {
        return eBayReturns.getText();
    }
    boolean checkcookwear() {
        return Cookwear.isDisplayed();
    }
    void clickcookwear() {
        Cookwear.click();
    }
    String cookweartext() {
        return cookwear.getText();
    }
    boolean checkgetcoupon() {
        return getcoupon.isDisplayed();
    }
    String scrolldownpage() {
        return scrolldown.getText();
    }
    boolean checkcareers() {
        return careers.isDisplayed();
    }
    String careertext() {
        return careers.getText();
    }
    void careerclick() {
        careers.click();
    }


}