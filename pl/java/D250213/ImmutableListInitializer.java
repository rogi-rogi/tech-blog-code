package pl.java.D250213;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class ImmutableListInitializer {
    public static void main(String[] args) {
        Deque<Integer> pq = new ArrayDeque<>(List.of(1, 2, 3));
        pq.add(4);

        System.out.println(pq);
    }
}
