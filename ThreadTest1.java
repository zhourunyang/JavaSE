public class ThreadTest1 {

    public static void main(String[] args) {

        Thread t = new MyThread();
        t.start();

        for (int i = 0; i < 57; i++) {
            System.out.println("主线程输出" + i);
        }
    }
}
