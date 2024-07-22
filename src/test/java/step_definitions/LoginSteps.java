package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginAdminPage;
import org.example.pageObject.LoginUserPage;
import org.example.pageObject.SampleLoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private final WebDriver driver = Hooks.driver;
    LoginAdminPage loginAdminPage = new LoginAdminPage(driver);
    LoginUserPage loginUserPage = new LoginUserPage(driver);

    @Given("Admin open the Middleman website")
    public void adminOpenTheMiddlemanWebsite() {
        loginAdminPage.verifyLandingPage();
    }

    @And("Click Sign in button")
    public void clickSignInButton() {
        loginAdminPage.clickButtonToSignIn();
    }

    @When("Admin input {string} as userName and {string} as password and click login")
    public void adminInputAsUserNameAndAsPasswordAndClickLogin(String email, String password) {
        loginAdminPage.verifyLoginPage();
        loginAdminPage.inputFieldUserName(email);
        loginAdminPage.inputFieldPassword(password);
        loginAdminPage.clickButtonLogin();
    }

    @Then("Admin should be directed to the dashboard page")
    public void adminShouldBeDirectedToTheDashboardPage() {
        Assert.assertTrue(loginAdminPage.verifyLabelProduct());
    }

    @Given("User open the Middleman website")
    public void userOpenTheMiddlemanWebsite() {
        loginAdminPage.verifyLandingPage();
    }

    @When("User input {string} as userName and {string} as password and click login")
    public void userInputAsUserNameAndAsPasswordAndClickLogin(String email, String password) {
        loginAdminPage.verifyLoginPage();
        loginAdminPage.inputFieldUserName(email);
        loginAdminPage.inputFieldPassword(password);
        loginAdminPage.clickButtonLogin();
    }

    @Then("User should be directed to the dashboard page")
    public void userShouldBeDirectedToTheDashboardPage() {
        Assert.assertTrue(loginAdminPage.verifyLabelProduct());
    }

    @Then("Admin not redirected to the dashboard page")
    public void adminNotRedirectedToTheDashboardPage() {
        loginAdminPage.verifyLoginPage();
    }

    @And("Admin should find allert and click ok")
    public void adminShouldFindAllertAndClickOk() {
        loginAdminPage.verifyAllert();
        loginAdminPage.clickButtonOk();
    }

    @And("User should find allert and click ok")
    public void userShouldFindAllertAndClickOk() {
        loginAdminPage.verifyAllert();
        loginAdminPage.clickButtonOk();
    }
}
