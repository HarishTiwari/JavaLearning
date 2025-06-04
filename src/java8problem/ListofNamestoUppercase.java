package java8problem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Convert all strings in a list to uppercase*/
public class ListofNamestoUppercase {
    public static void main(String[] args) {
        System.out.println("converting all the list to uppercase..");

        List<String> names = Arrays.asList("harish" , "sid", "test");

        List<String> upperNames = changeToUpperCase(names);

        System.out.println(upperNames);
    }

    public static List<String> changeToUpperCase(List<String> names){
        return names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
