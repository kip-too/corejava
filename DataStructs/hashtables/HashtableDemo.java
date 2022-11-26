package DataStructs.hashtables;

import java.util.Hashtable;

/**
 * Hashtable is a class in java collections that implements Map Interface and extends the 
 * Dictionary class.
 * It contains only unique elements and its synchronized.
 */
public class HashtableDemo {
   public static void main(String[] args) {
    Hashtable<Integer, String> map = new Hashtable<>();
    map.put(101, "C Language");
    map.put(102, "Domain");
    map.put(104, "Databases");
    System.out.println(map);
    map.remove(102);
    System.out.println(102);
   } 
}
