package DataStructs.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Cities {
    public static void main(String[] args) {
        Queue<String> city = new LinkedList<String>() ;
        System.out.println(city.isEmpty());
        //offer() = enqueue
        //poll() = dequeue
            city.offer("Nairobi");
            city.offer("Kampala");
            city.offer("Dar es Salaam");
            city.offer("Kigali");
            System.out.println(city);
            city.poll();
            System.out.println(city);
        
    }
}
