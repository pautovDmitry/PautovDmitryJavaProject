import java.util.Scanner;

public class ThirdTask {
        public void thirdTaskMethod() {
            int length;
            Scanner in = new Scanner(System.in);

            System.out.println("Hello!\nPlease, enter the length of the array:");
            length = in.nextInt();

            int myArray[] = new int[length];

            for (int i = 0; i < length; i++ ) {
                myArray[i] = i + 1;
            }
            for (int i =0; i < myArray.length; i++) {
                if(myArray[i]%3 == 0) {
                    System.out.println(myArray[i]);
                }
            }
        }
}
