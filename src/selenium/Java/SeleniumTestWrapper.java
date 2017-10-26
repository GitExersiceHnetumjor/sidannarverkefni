import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public abstract class SeleniumTestWrapper {
  static ChromeDriver driver;
  static String baseUrl;
  static String port;

  @BeforeClass
  public static void openBrowser() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //port = System.getenv("PORT");
    //if (port == null) {
      //  port = "4567";
    //}
    baseUrl = "https://sidannar-tictactoe.herokuapp.com/";
  }

  @AfterClass
  public static void closeBrowser(){
    driver.quit();
  }
}
