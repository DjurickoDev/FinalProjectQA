package tests;

import org.junit.Test;

import pages.CreateAccountPage;
import pages.HomePage;

public class CreateAccountTest extends BaseTest {

  String expectedCreateAccountPageTitle = "Create New Customer Account";

  @Test

  public void createAccount() {
    HomePage homePage = new HomePage(driver);
    CreateAccountPage createAccountPage = new CreateAccountPage(driver);
    homePage.goToHomePage();

    homePage.navigateToCreateAccountPage();
    createAccountPage.verifyNavigationToCreateAccountPage(expectedCreateAccountPageTitle);
    createAccountPage.createNewCustomerForm(firstNameInput, lastNameInput,
        emailInput, passwordNameInput,
        confirmPasswordInput);

  }
}
