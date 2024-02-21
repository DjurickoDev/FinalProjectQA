package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {

  public MyAccountPage(WebDriver driver) {
    super(driver);

  }

  By myAccountTitle = By.xpath("//span[@class='base']");
  By signInButton = By.xpath("//a[contains(text(), 'Sign In')]");

  

  By myAccountProfileData = By.xpath("//p[contains(text(), 'Marko Djurickovic')]");

  public MyAccountPage verifyNavToMyAccountPage(String expectedMyAccountPageTitle) {
    String actualMyAccountPageTitle = readText(myAccountTitle);
    verifyTextIsTheSame(expectedMyAccountPageTitle, actualMyAccountPageTitle);
    return this;
  }

  public MyAccountPage verifyMyProfileData(String expectedProfileDataName) {
    String actualProfileDataName = readText(myAccountProfileData);
    verifyTextIsTheSame(expectedProfileDataName, actualProfileDataName);
    return this;
  }

  public MyAccountPage clickOnSignInButton() {
    clickElement(signInButton);
    return this;
  }

}
