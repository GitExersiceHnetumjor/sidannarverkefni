import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class TestGameWeb extends SeleniumTestWrapper {

  @Test
  public void testTitleMatches() {
    driver.get(baseUrl);
    assertEquals("Tic Tac", driver.getTitle());
  }
}

  /*@Test
  public void testWinForX() {
    driver.get(baseUrl);
 
    WebElement buttonClicRestartGame = driver.findElement(By.id("newGame"));
    buttonClicRestartGame.click();
    WebElement buttonClickX1 = driver.findElement(By.id("1"));
    buttonClickX1.click();
    WebElement buttonClickO1 = driver.findElement(By.id("4"));
    buttonClickO1.click();
    WebElement buttonClickX2 = driver.findElement(By.id("2"));
    buttonClickX2.click();
    WebElement buttonClickO2 = driver.findElement(By.id("5"));
    buttonClickO2.click();
    WebElement buttonClickX3 = driver.findElement(By.id("3"));
    buttonClickX3.click();
    try{
        Thread.sleep(2000); 
    }
      catch(InterruptedException ie){
    } 
    WebElement buttonClicGetWinner = driver.findElement(By.id("whoseMove"));
    assertEquals("X has won the game", buttonClicGetWinner.getText());

  }


  @Test
  public void testWinForO() {
    driver.get(baseUrl);

    WebElement buttonClicRestasrtGame = driver.findElement(By.id("newGame"));
    buttonClicRestasrtGame.click();
    WebElement buttonClickX1 = driver.findElement(By.id("1"));
    buttonClickX1.click();
    WebElement buttonClickO1 = driver.findElement(By.id("4"));
    buttonClickO1.click();
    WebElement buttonClickX2 = driver.findElement(By.id("2"));
    buttonClickX2.click();
    WebElement buttonClickO2 = driver.findElement(By.id("5"));
    buttonClickO2.click();
    WebElement buttonClickX3 = driver.findElement(By.id("7"));
    buttonClickX3.click();
    WebElement buttonClickO3 = driver.findElement(By.id("6"));
    buttonClickO3.click();
    try{
        Thread.sleep(2000);
    }
      catch(InterruptedException ie){
    }  
    WebElement buttonClicGetWinner = driver.findElement(By.id("whoseMove"));
    assertEquals("O has won the game", buttonClicGetWinner.getText());  
  }

  
  @Test
  public void testDraw() {
    driver.get(baseUrl);
    
    WebElement buttonClicRestasrtGame = driver.findElement(By.id("newGame"));
    buttonClicRestasrtGame.click();
    WebElement buttonClickX1 = driver.findElement(By.id("1"));
    buttonClickX1.click();
    WebElement buttonClickO1 = driver.findElement(By.id("4"));
    buttonClickO1.click();
    WebElement buttonClickX2 = driver.findElement(By.id("2"));
    buttonClickX2.click();
    WebElement buttonClickO2 = driver.findElement(By.id("5"));
    buttonClickO2.click();
    WebElement buttonClickX3 = driver.findElement(By.id("6"));
    buttonClickX3.click();
    WebElement buttonClickO3 = driver.findElement(By.id("3"));
    buttonClickO3.click();
    WebElement buttonClickX4 = driver.findElement(By.id("7"));
    buttonClickX4.click();
    WebElement buttonClickO4 = driver.findElement(By.id("8"));
    buttonClickO4.click();
    WebElement buttonClickX5 = driver.findElement(By.id("9"));
    buttonClickX5.click();

    try{
        Thread.sleep(2000);
    }
      catch(InterruptedException ie){
    }  
    WebElement buttonClicGetWinner = driver.findElement(By.id("whoseMove"));
    assertEquals("There is a draw!", buttonClicGetWinner.getText());  

  }

  @Test
  public void testclickNewGame() {
    driver.get(baseUrl);

    WebElement buttonClicRestartGame = driver.findElement(By.id("newGame"));
    buttonClicRestartGame.click();

    WebElement buttonClicGetWinner1 = driver.findElement(By.id("1"));

    assertEquals("", buttonClicGetWinner1.getText());
    WebElement buttonClicGetWinner2 = driver.findElement(By.id("2"));

    assertEquals("", buttonClicGetWinner2.getText());
    WebElement buttonClicGetWinner3 = driver.findElement(By.id("3"));

    assertEquals("", buttonClicGetWinner3.getText());
    WebElement buttonClicGetWinner4 = driver.findElement(By.id("4"));

    assertEquals("", buttonClicGetWinner4.getText());
    WebElement buttonClicGetWinner5 = driver.findElement(By.id("5"));

    assertEquals("", buttonClicGetWinner5.getText());
    WebElement buttonClicGetWinner6 = driver.findElement(By.id("6"));

    assertEquals("", buttonClicGetWinner6.getText());
    WebElement buttonClicGetWinner7 = driver.findElement(By.id("7"));

    assertEquals("", buttonClicGetWinner7.getText());
    WebElement buttonClicGetWinner8 = driver.findElement(By.id("8"));

    assertEquals("", buttonClicGetWinner8.getText());
    WebElement buttonClicGetWinner9 = driver.findElement(By.id("9"));

    assertEquals("", buttonClicGetWinner9.getText());
  }
}*/