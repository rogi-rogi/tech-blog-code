package pl.java.D250326;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(20);                     // [20]
        pq.offer(5);                 // [5, 20]
        System.out.println(pq.add(15)); // [5, 15, 20], 출력: true

        System.out.println(pq);         // 출력: [5, 20, 15]
        System.out.println(pq.peek());  // 출력: 5
        pq.poll();                      // 5 제거
        System.out.println(pq);         // 출력:[15, 20]
        System.out.println(pq.poll());  // [20], 출력: 15
    }
}
