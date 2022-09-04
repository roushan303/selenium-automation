package com.routech.automation.utils;

import java.util.Properties;

public class ConfigLoader {

    private static ConfigLoader configLoader;
    private static Properties properties;
    private static String testEnv;
    private static String rahulShettyUserName;
    private static String rahulShettyPassword;
    private static String gmailUsername;
    private static String gmailPassword;

    private ConfigLoader(){
        testEnv = System.getProperty("env");
        properties = PropertyUtils.propertyLoader("src/main/resources/" + testEnv + ".properties");
        rahulShettyUserName = System.getProperty("rahulShettyUserName");
        properties.setProperty("rahulShettyUserName",rahulShettyUserName);
        rahulShettyPassword = System.getProperty("rahulShettyPassword");
        properties.setProperty("rahulShettyPassword",rahulShettyPassword);
        gmailUsername = System.getProperty("gmailUsername");
        properties.setProperty("gmailUsername",gmailUsername);
        gmailPassword = System.getProperty("gmailPassword");
        properties.setProperty("gmailPassword",gmailPassword);

    }

    public static ConfigLoader getInstance() {
        if(configLoader==null)
            configLoader = new ConfigLoader();
        return configLoader;
    }

    public String getRahulShettyUserName(){
        String prop = properties.getProperty("rahulShettyUserName");
        if(prop !=null)
            return prop;
        else {
            throw new RuntimeException("Properties not found in properties file");
        }
    }

    public String getRahulShettyPassword(){
        String prop = properties.getProperty("rahulShettyPassword");
        if(prop!=null)
            return prop;
        else {
            throw new RuntimeException("Properties not found in properties file");
        }
    }

    public String getRahulShettyWrongPassword(){
        String prop = properties.getProperty("rahulShettyWrongPassword");
        if(prop!=null)
            return prop;
        else {
            throw new RuntimeException("Properties not found in properties file");
        }
    }

    public String getGmailUsername(){
        String prop = properties.getProperty("gmailUsername");
        if(prop!=null)
            return prop;
        else {
            throw new RuntimeException("Properties not found in properties file");
        }
    }


    public String getGmailPassword(){
        String prop = properties.getProperty("gmailPassword");
        if(prop!=null)
            return prop;
        else {
            throw new RuntimeException("Properties not found in properties file");
        }
    }
}
