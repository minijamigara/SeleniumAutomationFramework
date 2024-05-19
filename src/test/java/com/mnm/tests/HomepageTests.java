package com.mnm.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomepageTests extends BaseTests {
    @Test
    public void test3(){
        driver.findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
    }
}
