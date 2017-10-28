import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public abstract class SeleniumTestWrapper {
  static WebDriver driver;
  static String baseUrl;
  static String port;

  @BeforeClass
  public static void openBrowser() {
    //System.setProperty("webdriver.gecko.driver", "/home/travis/build/sidannarverkefni")
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    baseUrl = "https://sidannar-tictactoe.herokuapp.com/";
  }

  @Test
  public void testTitleMatches() {
    driver.get(baseUrl);
    assertEquals("Tic Tac", driver.getTitle());
  }

  @AfterClass
  public static void closeBrowser(){
    driver.quit();
  }
}
