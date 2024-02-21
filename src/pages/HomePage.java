package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

  public HomePage(WebDriver driver) {
    super(driver);

  }

  String baseUrl = "https://magento.softwaretestingboard.com/";
  int numberOfProducts = 6;

  By productsElement = By.xpath("//li[@class='product-item']");
  By createAccountBtn = By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/create/']");

  By signInBtn = By.xpath(
      "//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']");

  public HomePage goToHomePage() {
    driver.get(baseUrl);
    return this;
  }

  public HomePage countHotSellersProducts() {
    java.util.List<WebElement> productList = driver.findElements(productsElement);
    int actualNumOfProducts= productList.size();
    verifyNumberOfElements(numberOfProducts, actualNumOfProducts);
    return this;
  }

  public HomePage navigateToCreateAccountPage() {
    clickElement(createAccountBtn);
    return this;
  }

  public HomePage navigateToSignInPage() {
    clickElement(signInBtn);
    return this;
  }
}
