package NopCom;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyStepdefs extends Utils{
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();



    @Given("^User has completed registration$")
    public void userHasCompletedRegistration()  {
        registerPage.openURL();
        registerPage.register();
    }


    @When("^I click on the Books Category$")
    public void iClickOnTheBooksCategory()  {
    }

    @And("^click on add to cart for the product$")
    public void clickOnAddToCartForTheProduct()  {
    }

    @Then("^book should be added to shopping cart$")
    public void bookShouldBeAddedToShoppingCart()  {
        homePage.addProductToTheBasket();
        homePage.checkProductisAddedToShoppingCart();
        Assert.assertTrue("This is incorrect page title",driver.findElement(By.xpath("//div[@class='page-title']")).getText().contains("Shopping cart"));
        Assert.assertTrue("This is correct Product",driver.findElement(By.xpath("//table/tbody/tr/td[4]/a")).getText().contains("Fahrenheit 451 by Ray Bradbury"));
    }


    @And("^I should be able to checkout successfully$")
    public void iShouldBeAbleToCheckoutSuccessfully()  {
        homePage.checkOutSuccessfully();
        assertTrue(By.xpath("//div[@class='page-title']"),"Checkout");
     //  assertTrue(By.xpath("//div[@id='billing-buttons-container']/input[1]"));
     //  assertTrue(By.xpath("//div[@class='order-number']"));

    }


}
