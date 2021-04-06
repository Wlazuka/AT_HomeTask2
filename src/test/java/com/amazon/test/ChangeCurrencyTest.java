package com.amazon.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeCurrencyTest extends BaseTest {

    private static final String AMAZON_HOME_PAGE_URL = "https://www.amazon.com/";
    private static final String AMAZON_HOME_PAGE_TITLE = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
    private static final String CHANGE_LANGUAGE_BTN_XPATH = "//a[@id='icp-nav-flyout']";
    private static final String AMAZON_LANGUAGE_PAGE_TITLE = "Change Language & Currency Settings";
    private static final String CURRENCY_DROPDOWN_XPATH = "//select[@id='icp-sc-dropdown']";

    private static final String NOTE = "Note: You will be shown prices in € - EUR - Euro on www.amazon.com as a reference only. You may or may not be able to pay in € - EUR - Euro see more details during checkout.";
    private static final String SAVE_BUTTON_XPATH = "//span[contains(text(),'Save changes')]";

    @Test
    public void changeCurrency() {
        driver.get(AMAZON_HOME_PAGE_URL);
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, AMAZON_HOME_PAGE_TITLE);
        driver.findElement(By.xpath(CHANGE_LANGUAGE_BTN_XPATH)).click();
        String languagePageTitle = driver.getTitle();
        Assert.assertEquals(languagePageTitle, AMAZON_LANGUAGE_PAGE_TITLE);

        Select drpCurrency = new Select(driver.findElement(By.xpath(CURRENCY_DROPDOWN_XPATH)));
        drpCurrency.selectByVisibleText("€ - EUR - Euro");

        Assert.assertTrue(driver.getPageSource().contains(NOTE));
    }

}
