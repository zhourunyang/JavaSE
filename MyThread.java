public class MyThread extends Thread {

    @Override
    public void run() {
        //描述线程执行任务
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread输出" + i);
        }
    }
}
