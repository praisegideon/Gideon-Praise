import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        String[][] userInputs = new String[10][10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < userInputs.length; i++) {
            for (int j = 0; j < userInputs[i].length; j++) {
                System.out.print("Enter input for index [" + i + "][" + j + "]: ");
                userInputs[i][j] = scanner.nextLine();
            }
        }
        System.out.println("\nYou entered the following inputs:");
        for (String[] row : userInputs) {
            for (String input : row) {
                System.out.print(input + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}