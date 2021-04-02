package com.amazon.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonSearchTest extends BaseTest {

    static final String AMAZON_HOME_PAGE_URL = "https://www.amazon.co.uk/";

    @Test
    public void basicAmazonProductSearch(){
        driver.get(AMAZON_HOME_PAGE_URL);



    }

}
