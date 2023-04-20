package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many Element do you want to enter?  Max(20)");
        int NumFrom= input.nextInt();
        while(NumFrom>20||NumFrom<=0){
            System.out.print("Invalid Number, please try again");
            NumFrom= input.nextInt();
        }
        int []Numbers =new int[NumFrom];
        FillArray(Numbers);
        PrintArrayValue(Numbers);

    }
    private static void FillArray(int [] Number){
        Scanner in=new Scanner(System.in);
        for(int i=0;i<Number.length;i++){
            Number[i]= in.nextInt();
        }
    }
    private static void PrintArrayValue(int []Number){
        System.out.print("Numbers in array are: ");
        System.out.println(Arrays.toString(Number));
    }
}
