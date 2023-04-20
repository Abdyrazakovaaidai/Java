package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDFromUser {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][]data=new int [3][3];
        for(int i=0;i<data.length;i++){
            System.out.println("Please enter 3 Numbers for  row "+(i+1));
            for(int j=0;j<data[0].length;j++){
                 data[i][j]= input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(data));

        System.out.println("//////////////////////////////////////");
        String [][] names =new String[3][3];
        for(int a=0;a<names.length;a++){
            System.out.println("Please enter your name:  ");
            for(int b=0;b<names[0].length;b++){
                names[a][b]= input.nextLine();
            }
        }
        System.out.println(Arrays.deepToString(names));

    }
}
