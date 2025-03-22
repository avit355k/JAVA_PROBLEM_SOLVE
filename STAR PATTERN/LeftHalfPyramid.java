import java.util.*;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        sc.close();

        for (int i = 1; i <= r; i++) {
            // Printing spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" "); // Corrected space printing
            }

            // Printing stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
