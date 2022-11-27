package functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fruits {
   public static void main(String[] args) {
    //create a stream 
    //filter() operation retains only elements that match a given predicate
    //map() transforms each element using a given function called a mapper
    //sorted() sorts elements of the stream according to their natural ordering
    //forEach() perfoms an action on each element of the stream before passing it to a consumer.
    //this operation is terminal operation,thus making it impossible to operate on it again


    Stream<String> fruitstream = Stream.of("apple","banana","pear","kiwi","orange");
    fruitstream.filter(s -> s.contains("a"))
               .map(String::toUpperCase)
               .sorted()
               .forEach(System.out::println);

    IntStream.range(1, 10).filter(a -> a%2 == 0).forEach(System.out::println);
    //Reusable Iterables - create an iterable so as to reuse a stream
    //it delegates a stream pipeline
    //useful for returning a modified view of a live data set without having to collect results into a temporay structure

    List<String> list = Arrays.asList("FOO","BAR");
    Iterable<String> iterable = () -> list.stream().map(String::toLowerCase).iterator();
    for(String str : iterable){
        System.out.println(str);
    }
    for(String str : iterable){
        System.out.println(str);
    }
   }
   

}
