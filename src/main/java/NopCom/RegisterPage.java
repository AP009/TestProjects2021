package NopCom;

import NopCom.BasePage;
import NopCom.Utils;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class RegisterPage extends Utils{

    public void openURL(){

        driver.get("http://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();

    }


    /*Login User - E2E test sceanrio requires Registeration each time.
    public void login(){
        clickElement(By.linkText("Log in"));
        enterValue(By.id("Email"),"ami.uk001@gmail.com");
        enterValue(By.id("Password"),"abc123");
        clickElement(By.xpath("//input[@value='Log in']"));

    }*/



    //Register user-
  public void register(){

        clickElement(By.linkText("Register"));
        clickElement(By.id("gender-female"));
        enterValue(By.id("FirstName"), "Ami");
        enterValue(By.id("LastName"), "Patel");
        String email = "ameepatel.uk" + randomDate() + "@gmail.com";
        enterValue(By.id("Email"), email);
        enterValue(By.id("Password"), "abc123");
        enterValue(By.id("ConfirmPassword"), "abc123");
        clickElement(By.id("register-button"));
    }


}
