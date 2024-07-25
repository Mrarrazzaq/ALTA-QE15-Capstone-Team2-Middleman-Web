package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.UserProductPage;
import org.openqa.selenium.WebDriver;

public class UserProductSteps {

    private final WebDriver driver = Hooks.driver;
    UserProductPage userProductPage = new UserProductPage(driver);
    @And("Click my product button")
    public void clickMyProductButton() {
        userProductPage.clickMyProductButton();
    }

    @Then("User should be directed to the my product page")
    public void userShouldBeDirectedToTheMyProductPage() {
        userProductPage.verifyMyProductPage();
    }

    @And("User click add new product button")
    public void userClickAddNewProductButton() {
        userProductPage.clickAddNewProductButton();
    }

    @Then("User should found add new product pop up")
    public void userShouldFoundAddNewProductPopUp() {
        userProductPage.verifyAddNewProductPopUp();
    }

    @And("User input product name {string}, input unit {string}, input stock {string}, input price {string}")
    public void userInputProductNameInputUnitInputStockInputPrice(String productName, String unit, String stock, String price) {
        userProductPage.inputProductName(productName);
        userProductPage.inputUnit(unit);
        userProductPage.inputStock(stock);
        userProductPage.inputPrice(price);
    }

    @And("User click save add product button")
    public void userClickSaveAddProductButton() {
        userProductPage.clickAddProductButton();
    }

    @Then("User should see the {string} in my product")
    public void userShouldSeeTheInMyProduct(String productName) {
        userProductPage.verifyProductName(productName);
    }

    @And("User click input product image {string}")
    public void userClickInputProductImage(String fileName) {
        userProductPage.inputProductImage(fileName);
    }

//    @And("User should find errorallert and click ok")
//    public void userShouldFindErrorallertAndClickOk() {
//        userProductPage.verifyErrorAllert();
//        userProductPage.clickOkButton();
//    }

    @And("User should find error alert {string}")
    public void userShouldFindErrorAlert(String errormessage) {
        userProductPage.verifyErrorAllert(errormessage);
        userProductPage.clickOkButton();
    }
}