package api_Runtime;

public class Test {
    public static void main(String[] args) {
        //Runtime  单例类
        Runtime r = Runtime.getRuntime();

        //r.exit(0);  //非0状态码表示异常终止

        //获取虚拟机可以获得的处理器数
        System.out.println(r.availableProcessors());

        //获取虚拟机的内存总量
        System.out.println(r.totalMemory() / 1024.0 / 1024.0);

        //获取虚拟机可用内存
        System.out.println(r.freeMemory() / 1024.0 / 1024.0);

        //启动某程序,返回代表该程序的对象 Process p = r.exec()
        //p.destroy() 关闭该程序

    }
}
