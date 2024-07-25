package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OutboundPage extends BasePage{
    public OutboundPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//ul[@class='menu menu-horizontal font-Roboto font-medium']//a[@id='to-outbound']")
    private WebElement outboundMenu;
    @FindBy(xpath = "//button[@id='to-history-outbound']")
    private WebElement outboundPage;
    @FindBy(xpath = "//div[@class='grid grid-cols-1 gap-2 m-2 md:grid-cols-2 lg:grid-cols-3']/div[1]//button[@id='btn-add-product-out']")
    private WebElement plusButton;
    @FindBy(xpath = "//button[@id='increment']")
    private WebElement plusOutButton;
    @FindBy(xpath = "//button[@id='btn-submit']")
    private WebElement submitOutboundButton;

    public void clickOutboundMenu() {
        waitForElementClickable(outboundMenu);
        click(outboundMenu);
    }

    public void verifyOutboundPage() {
        waitForElementVisible(outboundPage);
    }

    public void chooseProductToSell() {
        waitForElementClickable(plusButton);
        click(plusButton);
    }

    public void editNumberOfProductToSell() {
        waitForElementClickable(plusOutButton);
        click(plusOutButton);
    }

    public void clickSubmitOutboundButton() {
        waitForElementClickable(submitOutboundButton);
        click(submitOutboundButton);
    }
}
