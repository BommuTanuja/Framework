package MainPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class HomePage {
    public static WebDriver driver;

    @BeforeSuite
    public void driverIntialize(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @BeforeTest
    public void launchingApplication(){

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }





}
