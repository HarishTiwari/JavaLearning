package java8problem;

import java.util.Arrays;
import java.util.List;

public class reduceSum {

    public static void main(String[] args) {
        System.out.println("Sum of integers in the list..");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,8);

        int sum = reduceSumMethod(numbers);
        System.out.println(sum);
    }

    public static int reduceSumMethod(List<Integer> nums){
        return nums.stream().reduce(0,Integer::sum);
    }
}
