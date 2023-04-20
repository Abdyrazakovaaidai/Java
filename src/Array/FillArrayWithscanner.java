package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FillArrayWithscanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number max quantity of number should be 10");
        int number= input.nextInt();
        int [] array=new int[number];
        while(number>10||number<0){
            System.out.println("invalid number");
            number= input.nextInt();
        }
        FillArray(array);
        printArray(array);
        //10
        //1
        //2
        //3
        //4
        //5
        //6
        //7
        //8
        //9
        //10
        //Number of arrays are:  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    }
    public static void  FillArray(int [] N){
        Scanner input=new Scanner(System.in);
        for(int i=0;i<N.length;i++){
            N[i]= input.nextInt();
        }
    }
    public static void printArray(int [] a){
        System.out.print("Number of arrays are:  ");
        System.out.println(Arrays.toString(a));
    }
}
