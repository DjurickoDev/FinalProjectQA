package tests;

import org.junit.Test;

import pages.CreateAccountPage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.BasePage;

public class MyAccountTest extends BaseTest {
    @Test
    public void verifySuccessfulNavToMyAccountPage() {
        HomePage homePage = new HomePage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        MyAccountPage myAccount = new MyAccountPage(driver);
        BasePage basePage = new BasePage(driver);

        homePage.goToHomePage();

        homePage.navigateToCreateAccountPage();

        createAccountPage.createNewCustomerForm(firstNameInput, lastNameInput,
                emailInput, passwordNameInput,
                confirmPasswordInput);

        basePage.reload();
        myAccount.verifyNavToMyAccountPage("My Account");
    }
}
