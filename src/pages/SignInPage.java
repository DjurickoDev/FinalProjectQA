package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {

  public SignInPage(WebDriver driver) {
    super(driver);

  }

  String expectedSignInPageTitle = "Customer Login";
  // By errorElementBy = By.xpath("//fieldset[@class='fieldset login']");

  By errorEmailElementBy = By.id("email-error");
  By errorPasswordElementBy = By.id("pass-error");
  By errorWrongCredentalElementBy = By.id("email-error");

  By pageTitleBy = By.xpath("//span[@class='base']");
  By emailCredentialsBy = By.id("email");
  By passwordICredentialsBy = By.id("pass");
  By submitSignInBtn = By.id("send2");
  By SignInBtn = By.xpath("//li[@class='authorization-link']//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']");
  By productBtn = By.xpath("//a[@class='level-top ui-corner-all']");
  // By errorEmptyInputElementBy= By.xpath("//div[@class='mage-error']");
 

  public SignInPage verifyNavigationToSignIn() {
    String actualSignInPageTitle = readText(pageTitleBy);
    verifyTextIsTheSame(actualSignInPageTitle, expectedSignInPageTitle);

    return this;

  }

  public SignInPage verifyUnsuccessfulEmptyEmailSignIn(String expectedErrorMessage) {
    String actualEmailErrorMessage = readText(errorEmailElementBy);
    verifyTextIsTheSame(expectedErrorMessage, actualEmailErrorMessage);
    return this;
  }

  public SignInPage verifyUnsuccessfulEmptyPasswordSignIn(String expectedErrorMessage) {
    String actualPasswordErrorMessage = readText(errorPasswordElementBy);
    verifyTextIsTheSame(expectedErrorMessage, actualPasswordErrorMessage);
    return this;
  }
  
  public SignInPage verifyUnsuccessfulWrongCredentialsSignIn(String expectedErrorWrongCredentialMessage) {
    String actualWrongCredentialErrorMessage = readText(errorWrongCredentalElementBy);
    verifyTextIsTheSame(expectedErrorWrongCredentialMessage,actualWrongCredentialErrorMessage);
    return this;
  }

   public SignInPage enterSignInCredentials(String email, String password) {
    enterText(emailCredentialsBy, email);
    enterText(passwordICredentialsBy, password);

    return this;
  }

  public SignInPage verifySuccesfulSignOut(){
    verifyElementIsVisible(errorEmailElementBy);
    return this;
  }

  public SignInPage clickOnSignInBtn() {
    clickElement(submitSignInBtn);
    return this;
  }

  // public SignInPage loginPageClickOnfirstProduct() {
  // clickElement(productBtn);
  // return this;
  // }

}
