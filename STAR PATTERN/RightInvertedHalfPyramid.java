import java.util.*;

public class RightInvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        for(int i =r ; i>=1;i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
                //System.out.print(j+ " " ); (This will print the numbers in the inverted half pyramid)
            }
            System.out.println();
        }
        sc.close();
    }
}
