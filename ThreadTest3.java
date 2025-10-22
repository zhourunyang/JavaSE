import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> c = new MyCallable(10);
        FutureTask<String> f = new FutureTask<>(c);
        new Thread(f).start();
        //获取返回结果
        System.out.println(f.get());


    }
}
