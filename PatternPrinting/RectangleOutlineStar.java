package PatternPrinting;

import java.util.Scanner;

/* Print Star
 * * * *
 *     *
 *     *
 *     *
 * * * *
 */

public class RectangleOutlineStar  {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int rows, cols;
        System.out.print("Enter no. of rows:");
        rows = s.nextInt();

        System.out.print("Enter no. of Cols:");
        cols = s.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i==0 || i == rows - 1 || j==0 || j == cols - 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
