package api_Object;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //protected Object clone()

        User u1 = new User(1, "nanxi", "24234", new double[]{32,32.3,42.3});
        User u2 = (User) u1.clone();
        System.out.println(u1.toString());
        System.out.println(u2.toString());
    }
}
