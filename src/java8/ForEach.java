package java8;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        System.out.println("For each working...");

        List<Integer> lst = Arrays.asList(1,2,3,4,5,6);

        // forEach method
        // this is called internal loop

        lst.forEach( i -> System.out.println(i));
        lst.forEach(System.out::println); // using method reference

        // Filter and print only odd numbers
        System.out.println("Odd numbers:");
        lst.stream()
            .filter(i -> i % 2 != 0)
            .forEach(System.out::println);
    }
}
