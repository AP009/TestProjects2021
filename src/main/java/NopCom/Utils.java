package NopCom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {

    //Clear the textbox and enter values
    public static void enterValue(By by, String txtVal){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(txtVal);
    }

    //Click element
    public static void clickElement(By by) {

        driver.findElement(by).click();
    }


    //Wait method for invisibilty of Element
    public static void waitForInVisibilityOfElement(By by){

        WebDriverWait wait=new WebDriverWait(driver, 25);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));


    }

    public static void waitForVisibilityOfElement(By by){

        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }
    //AssetTrue Method
    public static void assertTrue(By by, String y){
        Assert.assertTrue(driver.findElement(by).getText().contains(y));
   }

    // AssertEquals Method
    public static void assertEquals(By actualpath,String expectedtxt){
        Assert.assertEquals(driver.findElement(actualpath).getText(),expectedtxt);

    }


    //generates random date
    public String randomDate() {
        DateFormat formatofdate = new SimpleDateFormat("ddMMyyHHmmss");
        return formatofdate.format(new Date());

    }


}
