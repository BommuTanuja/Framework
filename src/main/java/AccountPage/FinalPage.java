package AccountPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPage {
    WebDriver driver;
    public FinalPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    @FindBy(css=".title")
    WebElement complteTitle;
    @FindBy(css=".complete-header")
    WebElement thanksText;

    public String getcompleteTitle(){
        String text = complteTitle.getText();
       System.out.println(text);
        return text;
    }
    public String getthanksText(){
        String s =thanksText.getText();
        System.out.println(s);
        return s;
    }

}
