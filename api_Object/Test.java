package api_Object;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("一二", 12);
        System.out.println(s1);

        Student s2 = new Student("一二", 12);
        System.out.println(s2.equals(s1));
        System.out.println(s1 == s2);
    }
}
