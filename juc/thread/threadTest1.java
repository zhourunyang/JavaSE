package juc.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class threadTest1 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 方式1：继承 Thread 类（你当前用的）
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("线程1运行");
            }
        };
        t.start();

        // 方式2：实现 Runnable 接口（更推荐，因为可以避免单继承限制）
        Runnable task = () -> System.out.println("线程2运行");
        new Thread(task).start();

        // 方式3：实现 Callable 接口（可以有返回值、可以抛异常）
        FutureTask<String> futureTask = new FutureTask<>(() -> "3返回结果");
        new Thread(futureTask).start();
        String result = futureTask.get(); // 阻塞获取结果
        System.out.println(result);
        
        // 方式4：线程池（生产环境推荐方式）
        ExecutorService pool = Executors.newFixedThreadPool(10);
        pool.execute(() -> System.out.println("4线程运行"));
        pool.shutdown(); // 提交任务后要关闭线程池
        
        System.out.println("主线程running");
    }
}
