import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public abstract class SeleniumTestWrapper {
	static WebDriver driver;
	static String baseUrl = "https://sidannar-tictactoe.herokuapp.com/";
	

	@BeforeClass
	public static void openBrowser() {
		driver = new FirefoxDriver();
		driver.get(baseUrl);

	}

	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}

	@Test
	public void testTitle() {
		String title = driver.getTitle();
		assertEquals("Tic Tac Toe", title);
	}
}