package java8problem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {

    public static void main(String[] args) {
        System.out.println("Get distinct elements...");

        List<Integer> numbers = Arrays.asList(10, 20 , 30 , 30 , 60);

        List<Integer> distinctList = distinctList(numbers);
        System.out.println(distinctList);
    }

    public static List<Integer> distinctList(List<Integer> nums){
        return nums.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
