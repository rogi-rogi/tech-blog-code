package pl.java.D250326;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(5);
        pq.add(15);

        System.out.println(pq);         // [5, 20, 15]
        System.out.println(pq.peek());  // 5
        pq.poll();
        System.out.println(pq);         // [15, 20]
        System.out.println(pq.poll());  // 15, [20]
    }
}
