package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHistoryOrderPage extends BasePage {
    public static WebDriver webDriver;

    public AdminHistoryOrderPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//ul[@class='menu menu-horizontal font-Roboto font-medium']//a[@id='to-history-order']")
    private WebElement menuHistory;

    @FindBy(xpath = "//tbody[29]//button[@id='to-detail-order']")
    private WebElement detailProduct;

    @FindBy(xpath = "//button[@id='btn-done']")
    private WebElement doneButton;

    @FindBy(xpath = "//ul[@class='menu menu-horizontal font-Roboto font-medium']//a[@id='to-inventory']")
    private WebElement incomingMenu;


    public void clickMenuHistory() {
        waitForElementClickable(menuHistory);
        menuHistory.click();
    }

    public void clickDetail(){
        waitForElementClickable(detailProduct);
        detailProduct.click();

    }
    public void clickDoneButton() {

        doneButton.click();
    }

    public void clickMenuIncoming(){
        incomingMenu.click();
    }


}