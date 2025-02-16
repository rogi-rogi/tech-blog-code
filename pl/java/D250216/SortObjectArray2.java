package pl.java.D250216;

import java.awt.*;
import java.util.Arrays;

public class SortObjectArray2 {
    public static void main(String[] args) {
        Point[] points = {
                new Point(3, 7),
                new Point(3, 5),
                new Point(2, 4),
        };

        Arrays.sort(points, (p1, p2) -> {
            if (p1.x != p2.x) return p1.x - p2.x;
            return p1.y - p2.y;
        });

        System.out.println(Arrays.toString(points));
    }
}
