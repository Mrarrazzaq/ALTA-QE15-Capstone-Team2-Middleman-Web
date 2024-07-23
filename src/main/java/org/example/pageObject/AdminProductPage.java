package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminProductPage extends BasePage {
    public static WebDriver webDriver;

    public AdminProductPage(WebDriver driver) {
        super(driver);
    }

//    @FindBy(xpath = "//input[@id='input-search']")
//    private WebElement searchField;
//    @FindBy(xpath = "//div[@class='dropdown dropdown-end mx-2 hidden lg:block']")
//    private WebElement profileButton;
//    @FindBy(xpath = "//button[@class='btn btn-sm btn-secondary text-white mt-2 p-1']")
//    private WebElement logoutButton;
//    @FindBy(xpath = "//div[@id='__next']/div[@class='modal']/div[.='LogoutAre you sure you want to logout ?YesNo']")
//    private WebElement logoutModal;
//    @FindBy(xpath = "//button[@id='btn-yes']")
//    private WebElement yesButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary modal-button text-white font-Roboto']")
    private WebElement addProductButton;
    @FindBy(xpath = "//div[@id='__next']/div[@class='modal']//input[@id='input-image']")
    private WebElement addProductModal;
    @FindBy(xpath = "//div[@id='__next']/div[@class='modal']//input[@id='input-name']")
    private WebElement productNameField;
    @FindBy(xpath = "//div[@id='__next']/div[@class='modal']//input[@id='input-image']")
    private WebElement chooseImageFile;
    @FindBy(xpath = "//div[@id='__next']/div[@class='modal']//input[@id='input-unit']")
    private WebElement unitField;
    @FindBy(xpath = "//div[@id='__next']/div[@class='modal']//input[@id='input-stock']")
    private WebElement stockField;
    @FindBy(xpath = "//div[@id='__next']/div[@class='modal']//input[@id='input-price']")
    private WebElement priceField;
    @FindBy(xpath = "//button[normalize-space(text()) = 'Add']")
    public WebElement addButton;

    @FindBy(xpath = "//ul[@class='menu menu-horizontal font-Roboto font-medium']//a[@id='to-cart']")
    private WebElement inboundButton;
    @FindBy(xpath = "//ul[@class='menu menu-horizontal font-Roboto font-medium']//a[@id='to-outbound']")
    private WebElement outboundButton;
    @FindBy(xpath = "//button[@id='btn-submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//ul[@class='menu menu-horizontal font-Roboto font-medium']//a[@id='to-my-product']")
    private WebElement myProductButton;


    public void clickAddProduct() {
//        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-sm btn-primary modal-button text-white font-Roboto']")));
//        scrollIntoView(addProductButton);
//        waitForElementClickable(addProductButton);
        click(addProductButton);

    }
    public void verifyAddProductPopUp() {
        scrollIntoView(chooseImageFile);
        waitForElementClickable(chooseImageFile);
//        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='__next']/div[@class='modal']/div[.='Add ProductProduct Image*AddCancel']")));
////        boolean a = addProductModal.isDisplayed();
////        boolean b = productNameField.isDisplayed();
////        return a && b;
    }
    public void inputImageFile(String namaFile) {
        String filePath = System.getProperty("user.dir") + "/src/main/resources/" + namaFile;
        chooseImageFile.sendKeys(filePath);
    }
    public void inputProductDetails(String productName, String unit, String stock, String price) {
        productNameField.sendKeys(productName);
        unitField.sendKeys(unit);
        stockField.sendKeys(stock);
        priceField.sendKeys(price);
    }

    public void clickAddButton() {
//        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[5]/div/form/div[2]/button[@id='btn-add']")));
//        addButton.click();
        scrollIntoView(addButton);
        waitForElementClickable(addButton);
    }
    public String getRegisterSuccessAlert() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        return webDriver.switchTo().alert().getText();
    }
    public void clickAlertOk() {
        webDriver.switchTo().alert().accept();
    }
    public boolean verifyNewProduct(String productName) {
        String elementXpath = "//h2[.='" + productName + "']";
        // Wait for the element to be present
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement productNameH2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath)));
        // Return the text of the element
        return productNameH2.isDisplayed();
    }


    public Object verifyAllert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        if (alert == null) {
            throw new IllegalStateException("Alert was not present.");
        }
        // Optionally, you can verify the alert text
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);
        return null;
    }

    public void clickButtonOk() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
    public boolean checkInputFieldRequired(String elementName) {
        String elementXpath = "//input[@id='input-" + elementName + "']";
        WebElement inputElement = webDriver.findElement(By.xpath(elementXpath));
        boolean required = Boolean.parseBoolean(inputElement.getAttribute("required"));
        return required;
    }

    public String getValidationMessage(String elementXpath) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5)); // Adjust the timeout as needed
        WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath)));
        String validationMessage = inputElement.getAttribute("validationMessage");
        return validationMessage;
    }
}
