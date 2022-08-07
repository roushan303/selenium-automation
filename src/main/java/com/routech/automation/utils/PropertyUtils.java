package com.routech.automation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

    public static Properties propertyLoader(String filepath){
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(filepath);
            try {
                properties.load(fileInputStream);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to load properties file " + filepath);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Properties file not found " + filepath);
        }
        return properties;
    }
}
