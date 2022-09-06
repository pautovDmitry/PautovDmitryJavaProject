import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!\n" +
                "This console application is a completed test job.\n" +
                "Designed by Dmitry Pautov in the Java 11.0.16.1\n");
        new Menu(new Scanner(System.in)).start();
    }
}
