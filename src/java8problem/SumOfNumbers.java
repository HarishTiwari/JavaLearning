package java8problem;

import java.util.Arrays;
import java.util.List;

// This class demonstrates how to calculate the sum of numbers in a list using Java Streams
public class SumOfNumbers {

    public static void main(String[] args) {
        System.out.println("Sum of Number in list..");

        // Create a list of integers
        List<Integer> number = Arrays.asList(1, 2, 3, 5, 6);

        // Call the sumOfNumbers method to get the sum of the list
        int sum = sumOfNumbers(number);
        System.out.println(sum); // Print the result
    }

    /**
     * Calculates the sum of all integers in the given list using streams.
     *
     * @param nums List of integers to sum
     * @return The sum of all integers in the list
     */
    public static int sumOfNumbers(List<Integer> nums) {
        // Stream the list, then reduce by summing all elements, starting from 0
        return nums.stream()
                .reduce(0, Integer::sum);
    }
}
