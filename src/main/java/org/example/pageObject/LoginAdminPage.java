package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;

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
    @FindBy(css = "[alt='logo']")
    private WebElement labelProduct;  //DashboardPage



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
//        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.ENTER).perform();
//        scrollIntoView(labelProduct);
        waitForElementVisible(labelProduct);
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
}
