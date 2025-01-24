/*single loop*/
public class Family{
    public static void main(String[]args){
       String green = "*";
       String white= "=";
        int height=4;
        for(int i = 0; i<6 ||i<3; i++)
        System.out.println(green.repeat(4)+ white.repeat(4) + green.repeat(4));
    }
}

/*Nested loop*/
public class NigeriaFlagnextedLoop {
    public static void main(String[] args) {
        int height = 4; // Height of the flag
        int width = 12;  // Width of the flag

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 4 || j==5 ||j==6 || j==7) { // Middle columns for white stripe
                    System.out.print("*");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
