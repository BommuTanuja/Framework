package AccountPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage {
    WebDriver driver;
    public FinishPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(css="#finish")
    WebElement finishButton;

    public void navigatetoFinish(){
        finishButton.click();
    }
}
