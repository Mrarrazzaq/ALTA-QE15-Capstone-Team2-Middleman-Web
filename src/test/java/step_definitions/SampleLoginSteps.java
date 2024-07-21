package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.SampleLoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SampleLoginSteps {
    private final WebDriver driver = Hooks.driver;
    SampleLoginPage sampleLoginPage = new SampleLoginPage(driver);
    @Given("User open the web sauce demo")
    public void userOpenTheWebSauceDemo() {
        Assert.assertTrue(sampleLoginPage.verifyLoginPage());
    }

    @When("User input {string} as userName and {string} as password and click login")
    public void userInputAsUserNameAndAsPasswordAndClickLogin(String username, String password) {
        sampleLoginPage.inputFieldUserName(username);
        sampleLoginPage.inputFieldPassword(password);
        sampleLoginPage.clickButtonLogin();
    }

    @Then("User should be directed to the dashboard page")
    public void userShouldBeDirectedToTheDashboardPage() {
        Assert.assertTrue(sampleLoginPage.verifyLabelProduct());
    }
}
