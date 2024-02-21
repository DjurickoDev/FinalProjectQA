package tests;

import org.junit.Test;

import pages.BasePage;
import pages.HomePage;
// import pages.MyAccountPage;
import pages.RegisteredCustomerPage;
import pages.SignInPage;

public class LoginTests extends BaseTest {

  String expectedErrorEmptyEmail = "This is a required field.";
  String expectedErrorEmptyPassword = "This is a required field.";
  String wrongCredential = "bilo sta sto nije validno";
  String expectedErrorWrongCredentials = "Please enter a valid email address (Ex: johndoe@domain.com).";
 
  @Test
  public void verifySuccesfulLogin() {
    HomePage homePage = new HomePage(driver);
    SignInPage signInPage = new SignInPage(driver);
    // MyAccountPage myAccountPage = new MyAccountPage(driver);
    BasePage basePage = new BasePage(driver);
    RegisteredCustomerPage registeredCustomer = new RegisteredCustomerPage(driver);

    homePage.goToHomePage();
    homePage.navigateToSignInPage();
    signInPage.verifyNavigationToSignIn();

    signInPage.enterSignInCredentials(emailInput, passwordNameInput);

    signInPage.clickOnSignInBtn();
    basePage.reload();

    registeredCustomer.verifySucessfulSignIn();


    // basePage.reload();
    // myAccountPage.clickOnSignInButton();

    // myAccountPage.verifyNavToMyAccountPage("My Account");

  }

  // ovde sam imao problem nalazenja baga ,gde nakon klika na signin sajt ponovo me
  // odvede na home page umesto na myaccount.To sam resio tako sto sam odradio
  // reload stranice i nakon toga na jos jedan klik na signin i to nas odvede na
  // myaccount.

  @Test
  public void verifyUnsuccessfulLoginEmptyEmail() {
    HomePage homePage = new HomePage(driver);
    SignInPage signInPage = new SignInPage(driver);

    homePage.goToHomePage();
    homePage.navigateToSignInPage();

    signInPage.enterSignInCredentials("", passwordNameInput);
    signInPage.clickOnSignInBtn();

    signInPage.verifyUnsuccessfulEmptyEmailSignIn(expectedErrorEmptyEmail);
  }

  @Test
  public void verifyUnsuccessfulLoginEmptyPassword() {
    HomePage homePage = new HomePage(driver);
    SignInPage signInPage = new SignInPage(driver);
    BasePage basePage = new BasePage(driver);
    homePage.goToHomePage();
    homePage.navigateToSignInPage();

    basePage.reload();
    signInPage.enterSignInCredentials(emailInput, "");
    signInPage.clickOnSignInBtn();

    signInPage.verifyUnsuccessfulEmptyPasswordSignIn(expectedErrorEmptyPassword);
  }

  @Test
  public void verifyUnsuccessfulLoginWrongCredentials() {
    HomePage homePage = new HomePage(driver);
    SignInPage signInPage = new SignInPage(driver);

    homePage.goToHomePage();
    homePage.navigateToSignInPage();

    signInPage.enterSignInCredentials(wrongCredential, wrongCredential);
    signInPage.clickOnSignInBtn();

    signInPage.verifyUnsuccessfulWrongCredentialsSignIn(expectedErrorWrongCredentials);
  }
 

  

  @Test
  public void verifySucessfulLogout() {
    HomePage homePage = new HomePage(driver);
    SignInPage signInPage = new SignInPage(driver);
    BasePage basePage = new BasePage(driver);
    RegisteredCustomerPage registeredCustomerPage = new RegisteredCustomerPage(driver);

    homePage.goToHomePage();
    homePage.navigateToSignInPage();
    signInPage.verifyNavigationToSignIn();

    signInPage.enterSignInCredentials(emailInput, passwordNameInput);

    signInPage.clickOnSignInBtn();
    basePage.reload();
    registeredCustomerPage.expandMenu();
    registeredCustomerPage.SignOut();
    
    registeredCustomerPage.verifySuccessfulSignOut();
    
  }
}
