package com.mnm.tests;

import com.mnm.driver.Driver;
import com.mnm.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.io.IOException;

public final class HomepageTests extends BaseTests {

    private HomepageTests(){

    }
    @Test
    public void test3() throws Exception {
        Driver.initDriver();
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
    }
}
