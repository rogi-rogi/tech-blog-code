package pl.java.D250215;

import java.util.Arrays;
import java.util.Comparator;

public class SortPrimitiveArrayReverse4 {
    public static void main(String[] args) {
        int[] primitiveArray = {9, 2, 1, 5, 7};

        int[] descSortedPrimitiveArray = Arrays.stream(primitiveArray).boxed().
                sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(descSortedPrimitiveArray));
    }
}