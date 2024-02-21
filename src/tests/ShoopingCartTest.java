package tests;

import org.junit.Test;

import pages.ShoopingCart;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.ProductToCartPage;

public class ShoopingCartTest extends BaseTest {
  @Test
  public void verifyProductIsInTheCart() {
    HomePage homePage = new HomePage(driver);
    ProductToCartPage productToCart = new ProductToCartPage(driver);
    ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
    ShoopingCart cart = new ShoopingCart(driver);

    homePage.goToHomePage();

    productToCart.navToWhatsNewPage();
    productToCart.selectRandomProduct();
    // productToCart.productImgNavPDP();
    productToCart.randomProductImgNavPDP();
    productDetailsPage.selectSize();
    productDetailsPage.selectColor();
    productDetailsPage.addToCart();
    productDetailsPage.navToCart();

    cart.verifyNavToCart("Shopping Cart");
    // cart.verifyThatCertainItemIsInCart();
   
  }

  @Test
  public void verifyTotalPrice() {
    HomePage homePage = new HomePage(driver);
    ProductToCartPage productToCart = new ProductToCartPage(driver);
    ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
    ShoopingCart cart = new ShoopingCart(driver);

    homePage.goToHomePage();

    productToCart.navToWhatsNewPage();
    // productToCart.selectProduct();
    productToCart.selectRandomProduct();
    productToCart.randomProductImgNavPDP();
    productDetailsPage.selectSize();
    productDetailsPage.selectColor();
    productDetailsPage.addToCart();
    productDetailsPage.navToCart();

    cart.verifyItemPrice();

  }
}
