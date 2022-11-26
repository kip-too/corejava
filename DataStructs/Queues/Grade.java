package DataStructs.Queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class Grade {
    public static void main(String[] args) {
        Queue<Double> grade = new PriorityQueue<Double>();
        grade.offer(4.00);
        grade.offer(1.00);
        grade.offer(3.00);
        grade.offer(5.00);
        grade.offer(2.00);
        System.out.println(grade);

    }
}
