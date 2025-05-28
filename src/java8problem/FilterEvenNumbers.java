package java8problem;

//Given a list of integers, return a list containing only even numbers.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {

        List<Integer> numbers  = Arrays.asList(10,2,1,3,5,6,7,8);

        List<Integer> evenNumbers = getEvenNumbers(numbers);

        System.out.println(evenNumbers);
    }

    public static List<Integer> getEvenNumbers(List<Integer> lst){

        return lst.stream()
                .filter(n -> n %2==0)
                .collect(Collectors.toList());
    }
}
