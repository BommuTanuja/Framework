package MainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(css="#user-name")
    WebElement emailInputBox;
    @FindBy(name="password")
    WebElement passwordinputBox;
    @FindBy(css="#login-button")
    WebElement signinButton;

    public void navigateToLaunchPage(){ //name of the function
        emailInputBox.sendKeys("standard_user");
        passwordinputBox.sendKeys("secret_sauce");
        signinButton.click();
    }
}
