package DataStructs.Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class Application {
    public static void main(String[] args){
        Collection<String> c = new ArrayList<>();
        c.add("Java");
        c.add("football");
        c.add("coffee");
        c.add("Java");
        System.out.println(c);

        Collection<String> fav = new HashSet<>(c);
        System.out.println(fav);
    }
}
