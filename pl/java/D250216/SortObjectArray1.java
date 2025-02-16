package pl.java.D250216;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;

public class SortObjectArray1 {
    public static void main(String[] args) {
        Point[] points = {
                new Point(3, 7),
                new Point(3, 5),
                new Point(2, 4),
        };
        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                // x 좌표를 기준으로 정렬
                if (p1.x != p2.x) {
                    return p1.x - p2.x;
                } else {
                    // x 좌표가 같으면 y 좌표를 기준으로 정렬
                    return p1.y - p2.y;
                }
            }
        });
        System.out.println(Arrays.toString(points));
    }
}
