package com.orangeHrm.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {

    private static Properties properties;

    public static void loadPropertyFile() throws IOException {
        properties = new Properties();
        // File - is an object that the information is not converted to stream
        // FileInputStream - converts the data to stream - 0s and 1s
        // We want to read the file from external
        FileInputStream stream = new FileInputStream("src/test/resources/qa_config.properties");
        properties.load(stream);
    }

    public static String getUsername(){
        try {
            loadPropertyFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty("username");
    }

    public static String getPassword(){
        try {
            loadPropertyFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty("password");
    }

    public static String getBaseUrl(){
        try {
            loadPropertyFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty("baseUrl");
    }

}
