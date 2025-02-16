package pl.java.D250215;

import java.util.Arrays;

public class SortPrimitiveArrayReverse3 {
    public static void main(String[] args) {
        int[] primitiveArray = {9, 2, 1, 5, 7};

        Integer[] objectArray = Arrays.stream(primitiveArray).boxed().toArray(Integer[]::new);
        Arrays.sort(objectArray, (a, b) -> b - a);

        System.out.println(Arrays.toString(objectArray));
    }
}