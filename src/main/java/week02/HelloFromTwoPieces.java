package week02;

public class HelloFromTwoPieces {
    public static void main(String[] args) {
        System.out.println(a() + b());
    }

    static String a() {
        return "hello";
    }

    static String b() {
        return "B";
    }
}