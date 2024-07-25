package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.UserHIstoryOrderPage;
import org.example.pageObject.UserProductPage;
import org.openqa.selenium.WebDriver;

public class UserHistoryOrderSteps {
    private final WebDriver driver = Hooks.driver;
    UserHIstoryOrderPage userHIstoryOrderPage = new UserHIstoryOrderPage(driver);

    @And("Click history orders button")
    public void clickHistoryOrdersButton() {
        userHIstoryOrderPage.clickHistoryOrdersButton();
    }

    @Then("User should be directed to the history orders page")
    public void userShouldBeDirectedToTheHistoryOrdersPage() {
        userHIstoryOrderPage.verifyHistoryOrdersPage();
    }
}
