import java.util.Scanner;

public class SecondTask {
        public void secondTaskMethod() {
            String nameInSystem = "Vyacheslav";
            Scanner in = new Scanner(System.in);
            System.out.println("Welcome!\nEnter name \"Vyacheslav\":");
            String name = in.nextLine();

            while (!name.equals(nameInSystem)) {
                System.out.println("No such name exist! Try again.\nEnter name \"Vyacheslav\":");
                name = in.nextLine();
            }
            System.out.println("Hello, " + nameInSystem );
        }
}
