package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisteredCustomerPage extends BasePage {

  String expectedLoginTitle = "Welcome, Marko Djurickovic!";
  // String expectedLoginTitle = "Welcome, Marko Djurickovic!";

  By dropDown = By.xpath("//button[@class='action switch']");


  // By loginTitle = By.xpath("//span[@class='logged-in']");
  By loginTitle = By.xpath("//span[contains(text(), 'Welcome, Marko Djurickovic!')]");
  By signOutBtn = By.xpath("//li[@class='authorization-link']//a[@href='https://magento.softwaretestingboard.com/customer/account/logout/']");
  By signInBtn = By.xpath(
      "//li[@class='authorization-link']//a");
  // By signInBtn = By.xpath(
  //     "//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']");

  public RegisteredCustomerPage(WebDriver driver) {
    super(driver);

  }

  public RegisteredCustomerPage verifySucessfulSignIn() {
    String actualLoginTitle = readText(loginTitle);
    verifyTextIsTheSame(expectedLoginTitle, actualLoginTitle);
    return this;
  }

  public RegisteredCustomerPage verifySuccessfulSignOut(){
    verifyElementIsVisible(signInBtn);
    return this;
  }

  public RegisteredCustomerPage expandMenu() {
    clickElement(dropDown);
    return this;
  }

  public RegisteredCustomerPage SignOut() {
    clickElement(signOutBtn);
    return this;
  }

}
