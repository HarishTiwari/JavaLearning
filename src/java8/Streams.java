package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Streams {

    public static void main(String[] args) {
        System.out.println("Streams example..");

        List<Integer> list = Arrays.asList(3,2,1,6,7,9,8);

       int result =  list.stream()
                .sorted()
                .filter(n -> n %2 == 1)
                .map(n -> n*2)
                .reduce(0 , (c,e) -> c+e);

        System.out.println(result);
    }
}
