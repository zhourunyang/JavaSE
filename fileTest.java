import java.io.File;

public class fileTest {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\zry\\Desktop\\docker.txt");
        System.out.println(f.length());

        File file = new File("C:\\Users\\zry\\Desktop");
        System.out.println(file.length());

    }
}
