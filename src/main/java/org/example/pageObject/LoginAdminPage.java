package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.Alert;

public class LoginAdminPage extends BasePage{
    public LoginAdminPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//button[@id='to-login']")
    private WebElement buttonToSignIn;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement fieldUserName;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement fieldPassword;
    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement buttonLogin;
    @FindBy(xpath = "//input[@id='input-search']")
    private WebElement labelProduct;  //DashboardPage
    @FindBy(xpath = "//button[@id='to-register']")
    private WebElement buttonToSignUp;
    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement registerName;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement registerEmail;
    @FindBy (xpath = "//input[@id='input-password']")
    private WebElement registerPassword;
    @FindBy (xpath = "//input[@id='input-phone']")
    private WebElement registerPhoneNumber;
    @FindBy (xpath = "//input[@id='input-address']")
    private WebElement registerAddress;
    @FindBy (xpath = "//button[@id='to-register']")
    private WebElement registerButton;



    public void clickButtonToSignIn(){
        scrollIntoView(buttonToSignIn);
        click(buttonToSignIn);
    }
    public void inputFieldUserName(String userName){
        sendKeys(fieldUserName, userName);
    }
    public void inputFieldPassword(String password){
        sendKeys(fieldPassword, password);
    }
    public void clickButtonLogin(){
        scrollIntoView(buttonLogin);
        waitForElementClickable(buttonLogin);
        click(buttonLogin);
    }
    public boolean verifyLabelProduct(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(labelProduct));
        return isDisplayed(labelProduct);
    }
    public boolean verifyLoginPage(){
        waitForElementVisible(fieldUserName);
        waitForElementVisible(fieldPassword);
        waitForElementVisible(buttonLogin);
        return isDisplayed(fieldUserName) && isDisplayed(fieldPassword) && isDisplayed(buttonLogin);
    }
    public boolean verifyLandingPage() {
        waitForElementVisible(buttonToSignIn);
        return isDisplayed(buttonToSignIn);
    }

    public void verifyAllert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        if (alert == null) {
            throw new IllegalStateException("Alert was not present.");
        }
        // Optionally, you can verify the alert text
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);
    }

    public void clickButtonOk() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    public boolean verifyRegisterPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(registerAddress));
        return isDisplayed(registerAddress);
    }
    public void clickButtonToSignUp(){
        scrollIntoView(buttonToSignUp);
        waitForElementClickable(buttonToSignUp);
        click(buttonToSignUp);
    }
    public void clickButtonRegister(){
        scrollIntoView(registerButton);
        waitForElementClickable(registerButton);
        click(registerButton);
    }

    public void inputFieldStoreName(String storeName) {
        sendKeys(registerName, storeName);
    }

    public void inputFieldStoreEmail(String storeEmail) {
        sendKeys(registerEmail, storeEmail);
    }

    public void inputFieldStorePhoneNumber(String storePhoneNumber) {
        sendKeys(registerPhoneNumber, storePhoneNumber);
    }

    public void inputFieldStorePassword(String storePassword) {
        sendKeys(registerPassword, storePassword);
    }

    public void inputFieldStoreAddress(String storeAddress) {
        sendKeys(registerAddress, storeAddress);
    }
}
