package pl.java.D250208;

public class MultiThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("작업 1 시작");
            try { Thread.sleep(3000); } catch (InterruptedException _) {}
            System.out.println("작업 1 완료");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("작업 2 시작");
            try { Thread.sleep(3000); } catch (InterruptedException _) {}
            System.out.println("작업 2 완료");
        });

        thread1.start();
        thread2.start();
    }
}

