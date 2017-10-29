import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;


public abstract class SeleniumTestWrapper {
  static WebDriver driver;
  static String baseUrl;
  static String port;

  @BeforeClass
  public static void openBrowser() {

    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    baseUrl = "https://sidannar-tictactoe.herokuapp.com/";
  }


  @AfterClass
  public static void closeBrowser(){
    driver.quit();
  }
}
