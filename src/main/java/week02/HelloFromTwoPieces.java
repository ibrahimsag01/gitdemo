package week02;

public class HelloFromTwoPieces {
    public static void main(String[] args) {
        System.out.println(a() + b());
    }

    static String a() {
        return "A";
    }

    static String b() {
        return "world";
    }
}