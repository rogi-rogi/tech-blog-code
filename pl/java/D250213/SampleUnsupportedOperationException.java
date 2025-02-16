package pl.java.D250213;

import java.util.List;

public class SampleUnsupportedOperationException {
    public static void main(String[] args) {
        List<Integer> list = List.of(0);
        list.add(1);
    }
}
