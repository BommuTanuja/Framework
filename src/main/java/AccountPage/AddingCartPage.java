package AccountPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AddingCartPage {
    private WebDriver driver;
    public AddingCartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(css=".title")
    WebElement productsHeading;

    @FindBy(css = "div[class='inventory_item_price']")
    List<WebElement> allPrices;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    public void openCart(){
       cartIcon.click();
    }


    public void addHighestPriceItemToCart(double price){
        driver.findElement(By.xpath("//div[@class='inventory_item_price'][text()='"+price+"']/following-sibling::button")).click();
    }

    public String getHighestPriceItemName(double price){
        return driver.findElement(By.xpath("//div[@class='inventory_item_price'][text()='"+price+"']/parent::div/preceding-sibling::div/a/div")).getText();
    }

    public String getHeadingOfThePage(){
        String headingOfThePage = productsHeading.getText();
        System.out.println(headingOfThePage);

        return headingOfThePage;
    }
    public List<Double> getAllPrices(){
        List<Double> allPricesData = new ArrayList<>();
        for(int i=0; i<allPrices.size(); i++){
            allPricesData.add(Double.parseDouble(allPrices.get(i).getText().replaceAll("[$]", "")));
        }
        System.out.println(allPricesData);
        return allPricesData;
    }








}
