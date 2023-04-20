package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        ////1. Write a program to get two 2D arrays from the user and print the sum of it
        //        //Input:
        //        //Array 1
        //        //1 1 1
        //        //2 2 2
        //        //3 3 3
        //        //Array 2
        //        //4 4 4
        //        //2 2 2
        //        //1 1 1
        //        //
        //        //Output:
        //        //5 5 5
        //        //4 4 4
        //        //4 4 4

        Scanner input=new Scanner(System.in);
        int [][] numbers=new int [3][3];
        int[][] sum={{4,4,4},{2,2,2},{1,1,1}};
        for(int i=0;i<numbers.length;i++){
            System.out.println("Please enter some number for row: "+i);
            for(int j=0;j<numbers[i].length;j++){
                numbers[i][j]= input.nextInt();
            }
        }
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[0].length;j++){
               sum[i][j] +=numbers[i][j];
            }
            //System.out.println(Arrays.deepToString(sum));
        }
        System.out.print("Sum of: ");
        System.out.println(Arrays.deepToString(sum));

    }
}
