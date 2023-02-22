package AccountPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    private WebDriver driver;
    public CheckOutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(css="item_5_title_link")
    WebElement cartname;
    @FindBy(css="#checkout")
    WebElement checkButton;



    public boolean verifyProductAndPrice(String productName, double price){
        return driver.findElement(By.xpath("//div[text()='"+productName+"']/../following-sibling::div[@class='item_pricebar']/div[text()='"+price+"']")).isDisplayed();
    }
    public void navigatetocheckButton(){
        checkButton.click();

    }

}
