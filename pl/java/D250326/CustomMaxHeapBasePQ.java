package pl.java.D250326;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CustomMaxHeapBasePQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.offer(10); // [10]
        maxHeap.offer(5);  // [10, 5]
        maxHeap.offer(20); // [20, 5, 10]
        maxHeap.offer(15); // [20, 15, 10, 5]
        System.out.println(maxHeap);       // 출력 : [20, 15, 10, 5]

        // 문자열에 대한 최대힙은 역사전순 정렬
        PriorityQueue<String> stringMaxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        stringMaxHeap.offer("apple");
        stringMaxHeap.offer("banana");
        stringMaxHeap.offer("cherry");
        stringMaxHeap.offer("date");
        System.out.println(stringMaxHeap); // 출력 : [date, cherry, banana, apple]
    }
}
