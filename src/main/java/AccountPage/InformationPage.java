package AccountPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationPage {
    private WebDriver driver;
    public InformationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(name="firstName")
    WebElement firstnameButton;
    @FindBy(css="#last-name")
    WebElement lastnameButton;
    @FindBy(css="#postal-code")
    WebElement postalcodeButton;
    @FindBy(css="#continue")
    WebElement continueButton;

    public void givingInformation(){
        firstnameButton.sendKeys("tanuja");
        lastnameButton.sendKeys("bommu");
        postalcodeButton.sendKeys("521245");
        continueButton.click();
    }
}
