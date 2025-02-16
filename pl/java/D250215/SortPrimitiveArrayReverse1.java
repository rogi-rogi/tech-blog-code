package pl.java.D250215;

import java.util.Arrays;

public class SortPrimitiveArrayReverse1 {
    public static void main(String[] args) {
        int[] primitiveArray = {9, 2, 1, 5, 7};
        Arrays.sort(primitiveArray);

        for (int i = 0; i < primitiveArray.length / 2; ++i) {
            int temp = primitiveArray[i];
            primitiveArray[i] = primitiveArray[primitiveArray.length - 1 - i];
            primitiveArray[primitiveArray.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(primitiveArray));
    }
}
