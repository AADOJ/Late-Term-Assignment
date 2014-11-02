package is.aadoj.TicTacToe;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import static org.junit.Assert.*;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class TicTacToeWebTest {

    static WebDriver driver;
    static String baseUrl;
    static String port;

    @BeforeClass
    public static void before() {
        // Will be run before all tests in class are run
        driver = new FirefoxDriver();
        port = System.getenv("PORT");
        if(port == null) {
            port = "4567";
        }
        baseUrl = "http://localhost:" + port;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void after() {
        // Will be run after all tests in class have run
        driver.close();
    }
/*
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:4567/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
*/
  @Test
  public void testTickTackToeWeb() throws Exception {
    driver.get(baseUrl + "/");
    assertEquals("TicTacToe", driver.getTitle());
  }



  @Test
  public void testXWins() throws Exception {
    driver.get(baseUrl + "/");
//    for (int second = 0;; second++) {
//        if (second >= 60) fail("timeout");
//        try { if (isElementPresent(By.id("tile0"))) break; } 
//        catch (Exception e) {Thread.sleep(1000);}      
//    }
    driver.findElement(By.id("tile0")).click();
    assertEquals("X", driver.findElement(By.id("tile0")).getText());
    driver.findElement(By.id("tile8")).click();
    assertEquals("O", driver.findElement(By.id("tile8")).getText());
    driver.findElement(By.id("tile3")).click();
    assertEquals("X", driver.findElement(By.id("tile3")).getText());
    driver.findElement(By.id("tile2")).click();
    assertEquals("O", driver.findElement(By.id("tile2")).getText());
    driver.findElement(By.id("tile6")).click();
    assertEquals("X", driver.findElement(By.id("tile6")).getText());
    assertEquals("Winner is X!", driver.findElement(By.id("status")).getText());
  }
  @Test
  public void testTileIsOccupied() throws Exception {
    driver.get(baseUrl + "/");
//    for (int second = 0;; second++) {
//        if (second >= 60) fail("timeout");
//        try { if (isElementPresent(By.id("tile0"))) break; } 
//        catch (Exception e) {Thread.sleep(1000);}
//    }
    driver.findElement(By.id("tile0")).click();
    driver.findElement(By.id("tile4")).click();
    driver.findElement(By.id("tile0")).click();
    assertEquals("Tile is occupied!", driver.findElement(By.id("status")).getText());
    driver.findElement(By.id("tile6")).click();
    driver.findElement(By.id("tile8")).click();
    driver.findElement(By.id("tile3")).click();
  }
      @Test
  public void testBoardIsEmpty() throws Exception {
    driver.get(baseUrl + "/");
//    for (int second = 0;; second++) {
//        if (second >= 60) fail("timeout");
//        try { if (isElementPresent(By.id("tile0"))) break; } 
//        catch (Exception e) {Thread.sleep(1000);}
//    }
    driver.findElement(By.id("tile0")).click();
    assertEquals("X", driver.findElement(By.id("tile0")).getText());
    driver.findElement(By.id("tile8")).click();
    assertEquals("O", driver.findElement(By.id("tile8")).getText());
    driver.findElement(By.id("tile3")).click();
    assertEquals("X", driver.findElement(By.id("tile3")).getText());
    driver.findElement(By.id("tile2")).click();
    assertEquals("O", driver.findElement(By.id("tile2")).getText());
    driver.findElement(By.id("tile6")).click();
    assertEquals("X", driver.findElement(By.id("tile6")).getText());
    assertEquals("Winner is X!", driver.findElement(By.id("status")).getText());
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
 }
}
