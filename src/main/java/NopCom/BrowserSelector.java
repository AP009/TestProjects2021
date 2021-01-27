package NopCom;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BrowserSelector extends BasePage {

        /*  public static WebDriver createWebDriver() {
            String webdriver = System.getProperty("browser", "firefox");
            switch(webdriver) {
                case "firefox":
                    return new FirefoxDriver();
                case "chrome":
                    return new ChromeDriver();
                default:
                    throw new RuntimeException("Unsupported webdriver: " + webdriver);
            }
        }
    }
*/


    LoadProp loadProp = new LoadProp();
    Utils utils = new Utils();
    String browser = loadProp.getProperty("browser");

    public void selectBrowser() {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\Resources\\java\\Drivers\\chromedriver1.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        } else if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", "src\\Resources\\Java\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
    }

}
