package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.LoginAdminPage;
import org.example.pageObject.UserFlowPage;
import org.openqa.selenium.WebDriver;

public class UserFlowSteps {
    private final WebDriver driver = Hooks.driver;
    UserFlowPage userFlowPage = new UserFlowPage(driver);

    @And("User choose product to request and click add button")
    public void userChooseProductToRequestAndClickAddButton() {
        userFlowPage.selectproduct();
    }

    @And("User click mycart menu")
    public void userClickMycartMenu() {
        userFlowPage.clickMycartMenu();
    }

    @And("User edit number of product to request")
    public void userEditNumberOfProductToRequest() {
        userFlowPage.editNumberOfProductToRequest();
    }

    @Then("User click next button")
    public void userClickNextButton() {
        userFlowPage.clickNextButton();
    }

    @Then("User Redirected to payment page")
    public void userRedirectedToPaymentPage() {
        userFlowPage.redirectToPaymentPage();
    }
}
