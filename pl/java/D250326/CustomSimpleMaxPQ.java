package pl.java.D250326;

import java.util.PriorityQueue;

public class CustomSimpleMaxPQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> simpleMaxHeap = new PriorityQueue<>();
        simpleMaxHeap.offer(-10);
        simpleMaxHeap.offer(-5);
        simpleMaxHeap.offer(-20);
        simpleMaxHeap.offer(-15);
        System.out.println(simpleMaxHeap);  // 출력 : [-20, -15, -10, -5]

        // poll() 할 때 -1을 곱해 원래 값을 복원하여 최대 힙처럼 동작
        while (!simpleMaxHeap.isEmpty()) {
            int originalValue = -simpleMaxHeap.poll();
            System.out.println(originalValue);
        }
    }
}
