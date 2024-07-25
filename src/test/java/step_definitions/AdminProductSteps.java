package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.AdminProductPage;
import org.example.pageObject.LoginAdminPage;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.l;

public class AdminProductSteps {
    private final WebDriver driver = Hooks.driver;
    AdminProductPage adminProductPage = new AdminProductPage(driver);
    @Then("Admin click Add product button")
    public void adminClickAddProductButtonPopUp() {
        adminProductPage.clickAddProduct();
    }
    @Then("Admin can see Add Product Pop-Up")
    public void adminCanSeeAddProductPopUp() {
        adminProductPage.verifyAddProductPopUp();
    }

    @And("Click field input {string} for product image")
    public void clickFieldInputForProductImage(String filename) {
        adminProductPage.inputImageFile(filename);

    }

    @And("Admin input Product Name field {string}, input Unit field {string}, input Stock field {string}, input Price field {string}")
    public void adminInputProductNameFieldInputUnitFieldInputStockFieldInputPriceField(String pn, String un, String st, String pr) {
        adminProductPage.inputProductDetails(pn,un,st,pr);
    }

    @And("Click add button")
    public void clickAddButton() throws InterruptedException {
        adminProductPage.clickAddButton();

//        JavascriptExecutor j = (JavascriptExecutor) driver;

//        JavascriptExecutor j = (JavascriptExecutor) driver;
//        j.executeScript("arguments[0].click();",adminProductPage.addButton);
//        Thread.sleep(3000);
//        adminProductPage.clickAddButton();
//        Thread.sleep(3000);
    }
    @Then("Admin should see an Alert")
    public void adminShouldSeeAnAlert() {
        adminProductPage.verifyAllert();
        adminProductPage.clickButtonOk();
    }


    @When("Admin click OK on alert")
    public void adminClickOKOnAlert() {
        adminProductPage.clickAlertOk();
    }

    @Then("Admin shold see the {string} in my product")
    public void adminSholdSeeTheInMyProduct(String filename) {
        Assert.assertTrue(adminProductPage.verifyNewProduct(filename));

    }


    @Then("Admin shold see product {string} required validation message")
    public void adminSholdSeeProductRequiredValidationMessage(String elementName)throws InterruptedException {
            //html validation message bisa diubah-ubah oleh dev dan sudah di handle oleh browser
            String elementXpath = "//div[@id='__next']/div[@class='modal']//input[@id='input-" + elementName + "']";

            //check apakah elementnya memang required
            Assert.assertTrue(adminProductPage.checkInputFieldRequired(elementName));
            String expectedValidationMessage;

            if (elementName == "image") {
                expectedValidationMessage = "Please select a file.";
            } else {
                expectedValidationMessage = "Please fill out this field.";
            }

            Assert.assertEquals(expectedValidationMessage, adminProductPage.getValidationMessage(elementXpath));
        }

    @And("Admin click inbound page")
    public void adminClickInboundPage() {
        adminProductPage.clickInboundButton();
    }

    @Then("Admin can see Add {string} has been added")
    public void adminCanSeeAddHasBeenAdded(String productName) {
        adminProductPage.verifyInboundProduct(productName);
    }

    @When("Admin click submit button")
    public void adminClickSubmitButton() {
        adminProductPage.clickSubmitButton();

    }

    @Then("Admin should see the {string} in my product has been increased")
    public void adminSholdSeeTheInMyProductHasBeenIncreased(String nameproduct) {
            adminProductPage.verifyInboundProduct(nameproduct);
    }

    @When("Admin click button + at the page cart with name {string}")
    public void adminClickButtonAtThePageCartWithName(String productName) {
        adminProductPage.clickPlusButtonProduct(productName);
    }

}

