package is.ru.sparkit;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebDriver;

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

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:4567/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testXWins() throws Exception {
    driver.get(baseUrl + "/");
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

}