package TwoDArray;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        // Creating 2 Dimensional arrey
        // int [row][column] numbers=new int [5][3]; 5 row,3 column
//        int [][]numbers={{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(numbers[0][2]);
//        System.out.println(Arrays.toString(numbers[0])); //[1, 2, 3]
//        System.out.println(Arrays.toString(numbers[1]));//[4, 5, 6]
//        System.out.println(Arrays.toString(numbers[2]));//[7, 8, 9]
        System.out.println("PRINT ROW BY ROW");
        int [][] integers={
                 {3,5,7},
                 {10,2,9}};
        for(int i=0;i<2;i++){//row
            for(int j=0;j<3;j++){//column
                System.out.print(integers[i][j]+"  ");
            }
            System.out.println();
        }
        //PRINT ROW BY ROW
        //3
        //5
        //7
        //
        //10
        //2
        //9
        System.out.println("PRINT COLUMN BY COLUMN");
        for(int i=0;i<3;i++){//column
           for(int j=0;j<2;j++) {//row
               System.out.print(integers[j][i]+" ");
           }
            System.out.println();
        }
        //PRINT COLUMN BY COLUMN
        //3 10
        //5 2
        //7 9

        System.out.println(Arrays.deepToString(integers));//[[3, 5, 7], [10, 2, 9]]

    }
}
