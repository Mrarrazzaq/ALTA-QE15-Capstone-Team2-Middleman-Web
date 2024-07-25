package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserHIstoryOrderPage extends BasePage {
    public UserHIstoryOrderPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//ul[@class='menu menu-horizontal font-Roboto font-medium']//a[@id='to-history-order']")
    private WebElement historyButton;
    @FindBy(xpath = "//p[.='ID Order : 1721758543']")
    private WebElement historyPage;

    public void clickHistoryOrdersButton() {
        waitForElementClickable(historyButton);
        click(historyButton);
    }

    public void verifyHistoryOrdersPage() {
        waitForElementVisible(historyPage);
    }
}
