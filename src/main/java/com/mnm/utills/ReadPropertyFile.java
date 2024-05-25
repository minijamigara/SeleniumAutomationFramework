package com.mnm.utills;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class ReadPropertyFile {
    private ReadPropertyFile(){

    }

    public static String getValue(String key) throws Exception {
        String value = "";
        Properties property = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");

        property.load(file);
        value = property.getProperty(key);
        if (value==null){
            throw  new Exception("Property name" + key + "is not found. Please check config.properties");
        }
        return value;
    }
}

