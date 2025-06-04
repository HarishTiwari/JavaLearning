package java8problem;

/* Find the maximum value in a list of integers */

import java.util.Arrays;
import java.util.List;

public class FindMaximum {
    public static void main(String[] args) {
        System.out.println("Solution for find maximum..");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,8);

        int max = maxValueFromList(numbers);
        int secondMax = secondLargestFromList(numbers);
        int thirdMax = thirdLargestFromList(numbers);
        int secondSmallest = secondSmallestFromList(numbers);
        System.out.println(max);
        System.out.println(secondMax);
        System.out.println(thirdMax);
        System.out.println(secondSmallest);
    }

    public static int maxValueFromList(List<Integer> numbers){
        return numbers.stream()
                .max(Integer::compare)
                .orElse(0);
    }

    public static int secondLargestFromList(List<Integer> nums){
        return nums.stream()
                .distinct()
                .sorted((a,b) -> b -a)
                .skip(1)
                .findFirst()
                .orElse(-1);
    }

    // Returns the third largest unique number from the list, or -1 if not present
    public static int thirdLargestFromList(List<Integer> nums){
        return nums.stream()
                .distinct() // Remove duplicates
                .sorted((a,b) -> b -a) // Sort in descending order
                .skip(2) // Skip the first two largest elements
                .findFirst() // Get the third largest
                .orElse(-1); // Return -1 if not found
    }

    // Returns the second smallest unique number from the list, or -1 if not present
    public static int secondSmallestFromList(List<Integer> nums){
        return nums.stream()
                .distinct() // Remove duplicates
                .sorted((a,b) -> a - b) // Sort in ascending order
                .skip(1) // Skip the smallest element
                .findFirst() // Get the second smallest
                .orElse(-1); // Return -1 if not found
    }
}
