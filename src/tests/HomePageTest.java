package tests;

import org.junit.Test;

import pages.HomePage;
import pages.ProductDetailsPage;
import pages.ProductToCartPage;

public class HomePageTest extends BaseTest {

  @Test

  public void verifyNumberOfHotSellersProducts() {
    HomePage homePage = new HomePage(driver);
    homePage.goToHomePage();

    homePage.countHotSellersProducts();
  }

  @Test
  public void addProductToCart() {
    HomePage homePage = new HomePage(driver);
    ProductToCartPage productToCart = new ProductToCartPage(driver);
    ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);

    homePage.goToHomePage();

    productToCart.navToWhatsNewPage();
    productToCart.verifyNavToWhatsNewPage("What's New");
    productToCart.selectRandomProduct();
    // productToCart.productImgNavPDP();
    productToCart.randomProductImgNavPDP();
    productDetailsPage.selectSize();
    productDetailsPage.selectColor();
    productDetailsPage.addToCart();

  }

}
