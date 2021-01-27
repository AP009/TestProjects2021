package NopCom;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;

import java.util.concurrent.TimeUnit;

public class Hooks extends Utils{
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser() {

        browserSelector.selectBrowser();
        Dimension d = new Dimension(1400,1080);
        //Resize current window to the set dimension
        driver.manage().window().setSize(d);
    }



    @After
      public void closeBrowser (){
            driver.quit();
        }




}
