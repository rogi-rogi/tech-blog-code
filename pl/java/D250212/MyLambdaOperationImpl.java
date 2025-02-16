package pl.java.D250212;

public class MyLambdaOperationImpl {
    private static int myOperation(int a, int b, MyLambdaOperation o) {
        return o.operation(a, b);
    }
    public static void main(String[] args) {
        System.out.println("3 + 2 = " + myOperation(3, 2, (a, b) -> a + b));
        System.out.println("3 + 2 = " + myOperation(3, 2, (a, b) -> a - b));
    }
}