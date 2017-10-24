testTicTac
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class testTicTac extends SelenumTestWrapper {
	@Test
	public void testTitleMatch() {
		driver.get(baseUrl);
		assertEquals("Tic Tac Toe", driver.getTitle());
	}
}
