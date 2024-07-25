package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.*;

public class UserFlowPage extends BasePage {
    public UserFlowPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='grid grid-flow-row auto-rows-max grid-cols-1 md:grid-cols-2 lg:grid-cols-3']/div[1]//button[@id='to-mycart']")
    private WebElement addToCartButton;
    @FindBy(xpath = "//ul[@class='menu menu-horizontal font-Roboto font-medium']//a[@id='to-cart']")
    private WebElement mycartMenu;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm text-white text-lg']")
    private WebElement plusButton;
    @FindBy(xpath = "//button[@id='to-payment']")
    private WebElement toPaymentButton;
    @FindBy(xpath = "//div[@class='header-amount']")
    private WebElement paymentPage;


    public void clickAddToCartButton() {
        waitForElementClickable(addToCartButton);
        addToCartButton.click();
    }

    public void clickMycartMenu() {
        waitForElementClickable(mycartMenu);
        mycartMenu.click();
    }

    public void editNumberOfProductToRequest() {
        waitForElementClickable(plusButton);
        click(plusButton);
    }

    public void clickNextButton() {
        waitForElementClickable(toPaymentButton);
        click(toPaymentButton);
    }

    public void redirectToPaymentPage() {
        waitForElementVisible(paymentPage);
    }

    public void selectproduct() {
        waitForElementClickable(addToCartButton);
        click(addToCartButton);
    }
}