package pl.java.D250326;

import java.util.Arrays;
import java.util.PriorityQueue;

public class CustomCompositePQ {
    public static void main(String[] args) {
        PriorityQueue<int[]> customComposite = new PriorityQueue<>((a, b) -> {
            if (a[1] == b[1]) return Integer.compare(b[0], a[0]);
            return Integer.compare(a[1], b[1]);
        });
        customComposite.offer(new int[]{3, 100});  // [[3, 100]]
        customComposite.offer(new int[]{1, 20});   // [[1, 20], [3, 100]]
        customComposite.offer(new int[]{3, 20});   // [[3, 20], [3, 100], [1, 20]]
        customComposite.offer(new int[]{2, 30});   // [[3, 20], [2, 30], [1, 20], [3, 100]]
        customComposite.offer(new int[]{5, 20});   // [[5, 20], [3, 20], [1, 20], [3, 100], [2, 30]]

        System.out.println(Arrays.deepToString(customComposite.toArray()));
        // 출력 : [[5, 20], [3, 20], [1, 20], [3, 100], [2, 30]]


    }
}
