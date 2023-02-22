import AccountPage.*;
import MainPage.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Collections;

public class VerifyingTests extends HomePage {
    public LoginPage loginPage;
    public AddingCartPage addingCartPage;
    public CheckOutPage checkOutPage;
    public InformationPage informationPage;
    public FinishPage finishPage;
    public FinalPage finalPage;
    @BeforeClass
    public void intializePages() {
        loginPage = new LoginPage(driver);
        addingCartPage = new AddingCartPage(driver);
        checkOutPage = new CheckOutPage(driver);
        informationPage = new InformationPage(driver);
        finishPage = new FinishPage(driver);
        finalPage = new FinalPage(driver);

    }
    @Test
    public void SuccessFulTest(){
        loginPage.navigateToLaunchPage();
        Assert.assertEquals(addingCartPage.getHeadingOfThePage(), "PRODUCTS");

        Double maxPriceItem = Collections.max(addingCartPage.getAllPrices());
        System.out.println("maxPriceItem = " + maxPriceItem);

        addingCartPage.addHighestPriceItemToCart(maxPriceItem);
        String highestPriceProductName = addingCartPage.getHighestPriceItemName(maxPriceItem);
        addingCartPage.openCart();

        Assert.assertTrue(checkOutPage.verifyProductAndPrice(highestPriceProductName, maxPriceItem));
        checkOutPage.navigatetocheckButton();
        informationPage.givingInformation();
        finishPage.navigatetoFinish();

        Assert.assertEquals(finalPage.getcompleteTitle(),"CHECKOUT: COMPLETE!");
        Assert.assertEquals(finalPage.getthanksText(),"THANK YOU FOR YOUR ORDER");

    }

}
