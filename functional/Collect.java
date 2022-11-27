package functional;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Collect {
    //collect with toList() and toSet()
    public static void main(String[] args) {
        System.out.println(Arrays
            .asList("apple","banana","pear","kiwi","orange")
            .stream()
            .filter(s -> s.contains("a"))
            .collect(Collectors.toList())
        );

        
    };
}
