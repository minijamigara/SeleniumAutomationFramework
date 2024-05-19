package com.mnm.tests;

import com.mnm.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class LoginpageTests extends BaseTests{

    private LoginpageTests(){

    }
    @Test
    public void test1(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
    }
/*
    @Test
    public void test2(){
        Driver.driver.findElement(By.name("q")).sendKeys("Cars", Keys.ENTER);
    }*/
}
