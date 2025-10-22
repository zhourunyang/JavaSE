public class ThreadTest2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main线程输出：" + i);
        }
    }


}
