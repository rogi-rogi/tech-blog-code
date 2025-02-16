package pl.java.D250208;

public class SingleThreadSample {
    public static void main(String[] args) {
        System.out.println("작업 1 시작");
        try { Thread.sleep(3000); } catch (InterruptedException _) {}
        System.out.println("작업 1 완료");

        System.out.println("작업 2 시작");
        try { Thread.sleep(3000); } catch (InterruptedException _) {}
        System.out.println("작업 2 완료");
    }
}
