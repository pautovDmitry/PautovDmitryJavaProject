import java.util.Scanner;

public class Menu {
    private final Scanner scanner;
    FirstTask firstTask = new FirstTask();
    SecondTask secondTask = new SecondTask();
    ThirdTask thirdTask = new ThirdTask();
    FourthTask fourthTask = new FourthTask();
    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }
    public void printMenu() {
        System.out.println("If you want check:\n" +
                "the first task - enter 1\n" +
                "the second task - enter 2\n" +
                "the third task - enter 3\n" +
                "the fourth task - enter 4\n\n" +
                "If you want to exit the program - enter 5");
    }
    public void start() {
        if (this.scanner != null) {
            int userChoice;
            do {
                printMenu();
                System.out.print("Select the task you want the check:");
                userChoice = this.scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        firstTask.firstTaskMethod();
                        System.out.println();
                        break;
                    case 2:
                        secondTask.secondTaskMethod();
                        System.out.println();
                        break;
                    case 3:
                        thirdTask.thirdTaskMethod();
                        System.out.println();
                        break;
                    case 4:
                        fourthTask.fourthTaskMethod();
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("You entered an invalid number! Please, try again.");
                }
            } while (userChoice != 5);
        }
    }
}
