package pl.java.D250208;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        try (ExecutorService executorService = Executors.newFixedThreadPool(5)) {

            for (int i = 0; i < 10; i++) {
                executorService.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + " 작업 실행");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                });
            }

            executorService.shutdown(); // 스레드 풀 종료
        } // 3개의 스레드 풀 생성
    }
}
