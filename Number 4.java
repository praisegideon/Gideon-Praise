
import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        String[]userInputs = new String[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < userInputs.length; i++) {
            System.out.print("Enter input for index" + i + ": ");
            userInputs[i] = scanner.nextLine();
        }
        System.out.println("\nYou have entered inputs:");
        for (String input : userInputs){
            System.out.println(input);
        }
        scanner.close();
    }
}