package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserProductPage extends BasePage{
    public UserProductPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@id='__next']/div[@class='modal']//input[@id='input-image']")
    private WebElement chooseImageFile;

    @FindBy(xpath = "//ul[@class='menu menu-horizontal font-Roboto font-medium']//a[@id='to-inventory']")
    private WebElement myProductButton;

    @FindBy(xpath = "//button[@id='btn-add-modal']")
    private WebElement addProductButton;

    @FindBy(xpath = "//form[@id='form-add']/input[@id='input-name']")
    private WebElement addProductName;

    @FindBy(xpath = "//form[@id='form-add']/input[@id='input-unit']")
    private WebElement addProductUnit;

    @FindBy(xpath = "//form[@id='form-add']//input[@id='input-stock']")
    private WebElement addProductStock;

    @FindBy(xpath = "//form[@id='form-add']//input[@id='input-price']")
    private WebElement addProductPrice;

    @FindBy(xpath = "//button[@id='btn-add']")
    private WebElement addSaveProductButton;

    @FindBy(xpath = "//h2[.='Batu Kaliiii']")
    private WebElement newProductElement;

    public void clickMyProductButton() {
        waitForElementClickable(myProductButton);
        myProductButton.click();
    }

    public void verifyMyProductPage() {
        waitForElementClickable(newProductElement);
        driver.navigate().refresh();
        waitForElementClickable(newProductElement);
    }

    public void clickAddNewProductButton() {
        waitForElementClickable(addProductButton);
        addProductButton.click();
    }

    public void verifyAddNewProductPopUp() {
        waitForElementClickable(chooseImageFile);
    }

    public void inputProductName(String productName) {
        waitForElementClickable(addProductName);
        addProductName.sendKeys(productName);
    }

    public void inputUnit(String unit) {
        waitForElementClickable(addProductUnit);
        addProductUnit.sendKeys(unit);
    }

    public void inputStock(String stock) {
        waitForElementVisible(addProductStock);
        addProductStock.sendKeys(stock);
    }

    public void inputPrice(String price) {
        waitForElementVisible(addProductPrice);
        addProductPrice.sendKeys(price);
    }

    public void verifyProductName(String productName) {
//        waitForElementVisible(newProductElement);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(newProductElement));
        String dynamicXpath = String.format("//h2[.='%s']", productName);
        WebElement newProductElement = driver.findElement(By.xpath(dynamicXpath));
        waitForElementVisible(newProductElement);
        assert newProductElement.getText().equals(productName) : "Product name does not match";
    }

    public void inputProductImage(String namaFile) {
        String filePath = System.getProperty("user.dir") + "/src/main/resources/" + namaFile;
        chooseImageFile.sendKeys(filePath);
    }

    public void clickAddProductButton() {
        waitForElementClickable(addSaveProductButton);
        addSaveProductButton.click();
    }

    public void verifyErrorAllert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        if (alert == null) {
            throw new IllegalStateException("Alert was not present.");
        }
        // Optionally, you can verify the alert text
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);
        if (alertText.equals("there is an error in internal server")) {
            System.out.println("Alert text: " + alertText);
        }
    }

    public void clickOkButton() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
