package pl.java.thread;

public class NoThreadPoolExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
                try { Thread.sleep(2000); } catch (InterruptedException e) {}
            }).start();
        }
    }
}