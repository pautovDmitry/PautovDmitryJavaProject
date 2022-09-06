import java.util.Scanner;

public class FirstTask {
        public void firstTaskMethod() {
            Scanner in = new Scanner(System.in);
            System.out.println("Please, enter any number:");
            int num = in.nextInt();
            while (num <= 7) {
                System.out.println("Wrong, try again!");
                num = in.nextInt();
            }
            System.out.println("Hello!");
        }
}
