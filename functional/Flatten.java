package functional;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flatten {
    //a stream of items than are in turn streamable can be be flattened into a single continous stream using the flatMap()
   public static void main(String[] args) {
    List<String> list1 = Arrays.asList("one","two");
       List<String> list2 = Arrays.asList("three","four","five");
          List<String> list3 = Arrays.asList("six"); 
            List<String> finalist = Stream.of(list1,list2,list3).flatMap(Collection::stream).collect(Collectors.toList());
            System.out.println(finalist);
         
   } 
}
