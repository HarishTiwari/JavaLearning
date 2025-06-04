package java8problem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {
        System.out.println("Sort the list in ascending order..");

        List<Integer> numbers = Arrays.asList(10 , 2,3,50);

        List<Integer> sortedNumbers = sortTheList(numbers);

        System.out.println(sortedNumbers);
    }

    public static List<Integer> sortTheList(List<Integer> numbers){
        return numbers.stream()
                .sorted((a,b) -> a-b)
                .collect(Collectors.toList());
    }
}
