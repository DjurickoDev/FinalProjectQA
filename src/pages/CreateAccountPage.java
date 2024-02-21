package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {

  public CreateAccountPage(WebDriver driver) {
    super(driver);

  }

  By firstNameInputBy = By.id("firstname");
  By lastNameInputBy = By.id("lastname");
  By emailInputBy = By.id("email_address");
  By passwordInputBy = By.id("password");
  By confirmPasswordInputBy = By.id("password-confirmation");
  By createAnAccountBtn = By.xpath("//button[@class='action submit primary']");
  By createAccountPageTitle = By.xpath("//span[@class='base']");

  
  public CreateAccountPage verifyNavigationToCreateAccountPage(String expectedCreateAccountPageTitle) {
    String actualCreateAccountPageTitle = readText(createAccountPageTitle);
    verifyTextIsTheSame(expectedCreateAccountPageTitle, actualCreateAccountPageTitle);
    return this;
  }

  
  public CreateAccountPage createNewCustomerForm(String firstName, String lastName, String email, String password,
      String confirmPassword) {
    enterText(firstNameInputBy, firstName);
    enterText(lastNameInputBy, lastName);
    enterText(emailInputBy, email);
    enterText(passwordInputBy, password);
    enterText(confirmPasswordInputBy, confirmPassword);
    clickElement(createAnAccountBtn);
    return this;
  }

}
