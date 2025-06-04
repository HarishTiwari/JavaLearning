package java8problem;

import java.util.Arrays;
import java.util.List;

public class CountElements {

    public static void main(String[] args) {
        System.out.println("Count elements which are greater than 5..");

        List<Integer> numbers = Arrays.asList(2,40 ,10 ,5,1);
        int count = countOfElementGreaterThan5(numbers);
        System.out.println(count);
    }

    public static int countOfElementGreaterThan5(List<Integer> numbers){
        return (int)numbers.stream()
                .filter(n -> n > 5)
                .count();
    }
}
