/*nested loop*/
public class NigeriaFlagNestedLoop {
    public static void main(String[] args) {
        int height = 6; // Height of the flag
        int width = 11; // Width of the flag

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i < 3) { // First three rows with stars and equal signs
                    if (j < 4) {
                        System.out.print("*"); // Print stars
                    } else {
                        System.out.print("="); // Print equal signs
                    }
                } else { // Last three rows with only equal signs
                    if (j == 5) {
                        System.out.print(" "); // Small space between groups
                    }
                    System.out.print("="); // Print equal signs
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}

/*single loop*/
public class Flag {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 0; i < rows; i++) {
            if (i < 3) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 7; j++) {
                    System.out.print("=");
                }
            } else {
                for (int j = 0; j < 11; j++) {
                    System.out.print("=");
                }
            }

            System.out.println();
        }
    }
}
