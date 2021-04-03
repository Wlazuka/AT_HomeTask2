package com.amazon.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonSearchTest extends BaseTest {

    static final String AMAZON_HOME_PAGE_URL = "https://www.amazon.com/";
    static final String AMAZON_HOME_PAGE_TITLE = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
    static final String DELIVERY_ADDRESS_BUTTON_XPATH = "//span[contains(text(), \"Don't Change\")]";


    @Test
    public void basicAmazonProductSearch(){
        driver.get(AMAZON_HOME_PAGE_URL);
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, AMAZON_HOME_PAGE_TITLE);
        driver.findElement(By.xpath(DELIVERY_ADDRESS_BUTTON_XPATH)).click();

    }

}
