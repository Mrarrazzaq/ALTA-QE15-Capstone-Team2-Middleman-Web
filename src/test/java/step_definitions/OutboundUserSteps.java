package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.OutboundPage;
import org.example.pageObject.UserHIstoryOrderPage;
import org.openqa.selenium.WebDriver;

public class OutboundUserSteps {
    private final WebDriver driver = Hooks.driver;
    OutboundPage outboundPage = new OutboundPage(driver);

    @And("User click outbound menu")
    public void userClickOutboundMenu() {
        outboundPage.clickOutboundMenu();
    }
    @Then("User should be directed to the outbound page")
    public void userShouldBeDirectedToTheOutboundPage() {
        outboundPage.verifyOutboundPage();
    }

    @And("User choose product to sell")
    public void userChooseProductToSell() {
        outboundPage.chooseProductToSell();
    }

    @And("User edit number of product to sell")
    public void userEditNumberOfProductToSell() {
        outboundPage.editNumberOfProductToSell();
    }

    @And("User click submit outbound button")
    public void userClickSubmitOutboundButton() {
        outboundPage.clickSubmitOutboundButton();
    }
}
