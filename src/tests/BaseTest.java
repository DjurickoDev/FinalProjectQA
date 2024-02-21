package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
  public WebDriver driver;

  String firstNameInput = "Marko";
  String lastNameInput = "Djurickovic";
  String emailInput = "marko.djurickovic@gmail.com";
  String passwordNameInput = "Marko1988!!!";
  String confirmPasswordInput = "Marko1988!!!";

  // String firstNameInput = "Tanja";
  // String lastNameInput = "Djuricko";
  // String emailInput = "tanja.djuricko@gmail.com";
  // String passwordNameInput = "Tanja1988!!!";
  // String confirmPasswordInput = "Tanja1988!!!";

  // String firstNameInput = "Nemanj";
  // String lastNameInput = "Djurickov";
  // String emailInput = "nemanja.djuricko@gmail.com";
  // String passwordNameInput = "Nemanja1988!!!";
  // String confirmPasswordInput = "Nemanja1988!!!";

  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
