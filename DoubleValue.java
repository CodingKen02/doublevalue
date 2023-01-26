/*
Name: Kennedy Keyes
Date: October 24, 2021
Program: DoubleValue.java
Description: This program will create and initialize an array of double values 
and print how many elements are in the array.
 */
package doublevalue;
import java.util.Arrays;

/**
 *
 * @author codingken
 */
public class DoubleValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create an array of double values
        double[] doubleVal = {17.4, 192.3, 0.993, 2.22, 4.900, 8.253, 3.3346, 
            5.00, 6.110};
        
        // Print the array
        System.out.println(Arrays.toString(doubleVal));
        
        // Print to the user how many elements are in the array
        System.out.printf("I have %d elements stored in my array.%n", 
                doubleVal.length);
    }
    
}
