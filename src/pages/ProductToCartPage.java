package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductToCartPage extends BasePage {

  public ProductToCartPage(WebDriver driver) {
    super(driver);

  }

  By whatsNewTitle = By.xpath("//span[@class='base']");

  By whatsNewBtn = By.xpath("//a[@class='level-top ui-corner-all']");

  // By manJacketBtn = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div/div/ul[2]/li[2]/a");

  By imgProductElement = By.xpath("//img[@class='product-image-photo']");

  By randomProductElement = By.xpath("//li[@class='item']//a");

  By randomProductImg = By.xpath("//li[@class='item product product-item']");

  // By addToCartBtn = By
  // .xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[1]/div/div/div[3]/div/div[1]/form/button");

  public ProductToCartPage navToWhatsNewPage() {
    clickElement(whatsNewBtn);
    return this;
  }

  public ProductToCartPage verifyNavToWhatsNewPage(String expectedWhatsNewPageTitle) {
    String actualWhatsNewPageTitle = readText(whatsNewTitle);
    verifyTextIsTheSame(expectedWhatsNewPageTitle, actualWhatsNewPageTitle);
    return this;
  }

  // public ProductToCartPage selectProduct() {
  //   clickElement(manJacketBtn);
  //   return this;
  // }

  // public ProductToCartPage productImgNavPDP() {
  //   clickElement(imgProductElement);
  //   return this;
  // }
  public ProductToCartPage randomProductImgNavPDP() {
   clickOnRandomElementFromList(imgProductElement);
    return this;
  }

  public ProductToCartPage selectRandomProduct(){
    clickOnRandomElementFromList(randomProductElement);
    return this;
  }

}
