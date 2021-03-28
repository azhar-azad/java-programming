package com.azad.practice.java.GenericCollections.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

// Demonstrates class Properties of the java.util package.
public class PropertiesTest {

    public static void main(String[] args) {

        Properties table = new Properties();

        // set properties
        table.setProperty("color", "blue");
        table.setProperty("width", "200");

        System.out.println("After setting properties");
        listProperties(table);

        // replace property value
        table.setProperty("color", "red");

        System.out.println("After replacing properties");
        listProperties(table);

        saveProperties(table);

        table.clear(); // empty table

        System.out.println("After clearing properties");
        listProperties(table);

        loadProperties(table);

        // get value of property color
        Object value = table.getProperty("color");

        // check if value is in table
        if (value != null)
            System.out.printf("Property color's value is %s\n", value);
        else
            System.out.println("Property color is not in table");
    }

    // load properties from a file
    private static void loadProperties(Properties props) {

        // load contents of table
        try {
            FileInputStream input = new FileInputStream("/home/azad/Workspaces/java/java-programming.git" +
                    "/src/com/azad/practice/java/GenericCollections/Properties/dat_files/props.dat");
            props.load(input); // load properties
            input.close();
            System.out.println("After loading properties");
            listProperties(props);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    // save properties to a file
    private static void saveProperties(Properties props) {

        // save contents of table
        try {
            FileOutputStream output = new FileOutputStream("/home/azad/Workspaces/java/java-programming.git" +
                    "/src/com/azad/practice/java/GenericCollections/Properties/dat_files/props.dat");
            props.store(output, "Sample Properties"); // save properties
            output.close();
            System.out.println("After saving properties");
            listProperties(props);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    // output property values
    private static void listProperties(Properties props) {

        Set<Object> keys = props.keySet(); // get property names

        // output name/value pairs
        for (Object key: keys)
            System.out.printf("%s\t\t%s\n", key, props.getProperty((String) key));

        System.out.println();
    }
}
