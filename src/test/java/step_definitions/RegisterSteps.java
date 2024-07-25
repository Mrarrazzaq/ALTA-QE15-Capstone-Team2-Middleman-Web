package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginAdminPage;
import org.example.pageObject.LoginUserPage;
import org.example.pageObject.RegisterUserPage;
import org.example.pageObject.SampleLoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegisterSteps {

    private final WebDriver driver = Hooks.driver;
    LoginAdminPage loginAdminPage = new LoginAdminPage(driver);

    @And("Click Sign up button")
    public void clickSignUpButton() {
        loginAdminPage.clickButtonToSignUp();
    }

    @And("User should be directed to the register page")
    public void userShouldBeDirectedToTheRegisterPage() {
        loginAdminPage.verifyRegisterPage();
    }

    @Then("User not redirected to the login page")
    public void userNotRedirectedToTheLoginPage() {
        loginAdminPage.verifyRegisterPage();
    }

    @And("User fill the form {string} as store name, {string} as store email, {string} as store phone number, {string} as store password, {string} as store address")
    public void userFillTheFormAsStoreNameAsStoreEmailAsStorePhoneNumberAsStorePasswordAsStoreAddress
            (String storeName
                    , String storeEmail
                    , String storePhoneNumber
                    , String storePassword
                    , String storeAddress
            )
    {
        loginAdminPage.inputFieldStoreName(storeName);
        loginAdminPage.inputFieldStoreEmail(storeEmail);
        loginAdminPage.inputFieldStorePhoneNumber(storePhoneNumber);
        loginAdminPage.inputFieldStorePassword(storePassword);
        loginAdminPage.inputFieldStoreAddress(storeAddress);
    }

    @When("User click register button")
    public void userClickRegisterButton() {
        loginAdminPage.clickButtonRegister();
    }

    @Then("User should be directed to the login page")
    public void userShouldBeDirectedToTheLoginPage() {
        loginAdminPage.verifyLoginPage();
    }
}
