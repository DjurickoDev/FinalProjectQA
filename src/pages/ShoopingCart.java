package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoopingCart extends BasePage {

  public ShoopingCart(WebDriver driver) {
    super(driver);

  }

  // By itemNameBy = By.xpath("");

  // By cartPageTitleBy = By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span");
  By cartPageTitleBy = By.xpath("//span[@class='base']");

  By subtotalPrice = By.xpath("//td[@class='amount']//span[@data-th='Subtotal']");

  By taxPrice = By.xpath("//td[@data-th='Tax']//span[@class='price']");
  By totalPrice = By.xpath("//strong//span[@class='price']");

  public ShoopingCart verifyNavToCart(String expectedCartPageTitle) {
    String actualCartPageTitle = readText(cartPageTitleBy);
    verifyTextIsTheSame(expectedCartPageTitle, actualCartPageTitle);
    return this;
  }

  public ShoopingCart verifyItemPrice() {
    String priceText = readText(subtotalPrice).substring(1);
    double actualPrice = convertTextToNumber(priceText);
    String taxText = readText(taxPrice).substring(1);
    double actualTax = convertTextToNumber(taxText);
    String totalText = readText(totalPrice).substring(1);
    double totalCheckoutPrice = convertTextToNumber(totalText);

    verifyPrice(actualPrice + actualTax, totalCheckoutPrice);

    return this;
  }

 

  // public ShoopingCart verifyThatCertainItemIsInCart(String expectedItemName) {
  // String actualItemName = readText(itemNameBy);
  // verifyTextIsTheSame(expectedItemName, actualItemName);
  // return this;
  // }
  
}
