package com.mnm.constants;

public class FrameworkConstants {

    private FrameworkConstants(){

    }
    private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";

    public static String getChromeDriverPath() {
        return CHROMEDRIVERPATH;
    }
}
