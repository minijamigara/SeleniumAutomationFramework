package com.mnm.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginpageTests extends BaseTests{

    @Test
    public void test1(){
        driver.findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
    }

    @Test
    public void test2(){
        driver.findElement(By.name("q")).sendKeys("Cars", Keys.ENTER);
    }
}
