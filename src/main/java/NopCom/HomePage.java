package NopCom;

import NopCom.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage extends Utils {

    public void addProductToTheBasket(){
        clickElement(By.linkText("Books"));
        Select sortByName = new Select(driver.findElement(By.id("products-orderby")));
        sortByName.selectByVisibleText("Position");
        sortByName.selectByIndex(1);
        clickElement(By.xpath("//input[@value='Add to cart']"));
    }

    public void checkProductisAddedToShoppingCart() {
        waitForInVisibilityOfElement(By.linkText("shopping cart"));
        clickElement(By.linkText("Shopping cart"));
    }

      public void checkOutSuccessfully()  {
        waitForInVisibilityOfElement(By.linkText("shopping cart"));
        clickElement(By.id("topcartlink"));
        clickElement(By.id("termsofservice"));
        clickElement(By.id("checkout"));
        Select selectcountry = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        selectcountry.selectByVisibleText("Select country");
        selectcountry.selectByValue("42");
        enterValue(By.id("BillingNewAddress_City"),"London");
        enterValue(By.id("BillingNewAddress_Address1"),"140, St pauls Avanue");
        enterValue(By.id("BillingNewAddress_ZipPostalCode"),"HA3 9PT");
        enterValue(By.id("BillingNewAddress_PhoneNumber"),"07599000000");
        clickElement(By.xpath("//input[@value='Continue']"));
        waitForVisibilityOfElement(By.xpath("//div[@id='shipping-method-buttons-container']/input"));
        clickElement(By.xpath("//div[@id='shipping-method-buttons-container']/input"));
        waitForVisibilityOfElement(By.xpath("//div[@id='payment-method-buttons-container']/input"));
        clickElement(By.xpath("//div[@id='payment-method-buttons-container']/input"));
        waitForVisibilityOfElement(By.xpath("//div[@id='payment-info-buttons-container']/input"));
        clickElement(By.xpath("//div[@id='payment-info-buttons-container']/input"));
        waitForVisibilityOfElement(By.xpath("//div[@id='confirm-order-buttons-container']/input"));
        clickElement(By.xpath("//div[@id='confirm-order-buttons-container']/input"));


    }

}
