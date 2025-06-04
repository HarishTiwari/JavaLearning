package java8problem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*

 */
public class ListStreamQuestion {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a.csv","b.txt","c.csv");
        List<String> list2 = Arrays.asList("txt" , "csv");

        Map<String, Long> map = list2.stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n -> ((list1.stream()
                                .filter(m -> m.contains(n))
                                .count()))));

        System.out.println(map);
    }
}
