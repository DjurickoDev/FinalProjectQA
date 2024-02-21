package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends BasePage {

  public ProductDetailsPage(WebDriver driver) {
    super(driver);

  }

  By cartPageTitle = By.xpath("//span[@class='base']");
  By productSizeElements = By.xpath("//div[@class='swatch-option text']");
  By productColorElements = By.xpath("//div[@class='swatch-option color']");

  // By cartIcon = By.xpath("//a[@class='action showcart']");
  By cartIcon = By.xpath(
      "//div[@class='message-success success message']//a[@href='https://magento.softwaretestingboard.com/checkout/cart/']");

  By addToCartBtn = By.id("product-addtocart-button");

  // int expectedProductSizes = 5;

  public ProductDetailsPage selectSize() {
    clickOnRandomElementFromList(productSizeElements);
    return this;
  }

  public ProductDetailsPage selectColor() {
    clickOnRandomElementFromList(productColorElements);
    return this;
  }

  public ProductDetailsPage addToCart() {
    clickElement(addToCartBtn);
    return this;
  }

  public ProductDetailsPage navToCart() {
    clickElement(cartIcon);
    return this;
  }

  public ProductDetailsPage verifyCartPage(String expectedCartPageTitle) {
    String actualCartPageTitle = readText(cartPageTitle);
    verifyTextIsTheSame(expectedCartPageTitle, actualCartPageTitle);
    return this;
  }

}
