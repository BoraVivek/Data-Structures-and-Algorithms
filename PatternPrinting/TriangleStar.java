package PatternPrinting;

import java.util.Scanner;

/*
 *
 * *
 * * *
 * * * *
 * * * * *
 */

public class TriangleStar {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int rows, cols;
        System.out.print("Enter no. of rows:");
        rows = s.nextInt();

        System.out.print("Enter no. of Cols:");
        cols = s.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
