package NopCom;

import NopCom.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class DemoPage extends Utils {


    JavascriptExecutor js = (JavascriptExecutor) driver;

    //to demo handling iframe on the page

    public void LaunchDemoPage() {

        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       js.executeScript("window.scrollBy(0,2000)");
}


    public void CheckAdvertisementIsVisible(){

        driver.switchTo().frame("a077aa5e");
        clickElement(By.xpath("html/body/a/img"));
     //   waitForVisibilityOfElement(By.linkText());
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
    }

    public void ClickTheAdvertisement(){
        System.out.println("Navigating to the new page" + driver.getCurrentUrl());
    }


}
