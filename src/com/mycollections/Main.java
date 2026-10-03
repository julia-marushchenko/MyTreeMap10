/**
 *  Java program to crete, update, and delete data from TreeMap.
 */

package com.mycollections;

import java.util.Map;
import java.util.TreeMap;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create an instance of TreeMap.
        Map<Long, String> myMap = new TreeMap<>();

        // Add keys and values to myMap.
        myMap.put(123456789L, "Autumn");
        myMap.put(98765765432L, "Winter");
        myMap.put(43211234567L, "Spring");
        myMap.put(54467894L, "Summer");

        // Printing values of myMap to console.
        System.out.println(myMap); // Output: {54467894=Summer, 123456789=Autumn, 43211234567=Spring, 98765765432=Winter}

        // Add keys and values to myMap.
        myMap.put(123456789L, "Autumn / Winter");


        // Printing values of myMap to console.
        System.out.println(myMap); // Output: {54467894=Summer, 123456789=Autumn / Winter, 43211234567=Spring,
                                   // 98765765432=Winter}

        // Update.
        myMap.replace(54467894L, "Summer / Autumn");

        // Printing values of myMap to console.
        System.out.println(myMap); // Output: {54467894=Summer / Autumn, 123456789=Autumn / Winter, 43211234567=Spring,
                                   // 98765765432=Winter}

        // Delete.
        myMap.remove(123456789L);
        myMap.remove(123456789L);

        // Printing values of myMap to console.
        System.out.println(myMap); // Output: {54467894=Summer / Autumn, 43211234567=Spring, 98765765432=Winter}

    }
}