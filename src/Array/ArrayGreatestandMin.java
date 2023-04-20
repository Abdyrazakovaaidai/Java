package Array;

import java.util.Scanner;

public class ArrayGreatestandMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] numbers=new int[4];

        for(int i=0;i<numbers.length;i++){
            System.out.println("Please enter number");
          numbers[i]= input.nextInt();
        }
        int greatest=numbers[0];
        int minimum=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>greatest){
                greatest=numbers[i];
            }if(numbers[i]<minimum){
                minimum=numbers[i];
            }
        }
        System.out.println("Greatest: "+greatest+"  Minimum:  "+minimum);
        ///Please enter number
        //2
        //Please enter number
        //3
        //Please enter number
        //5
        //Please enter number
        //3
        //Greatest: 5  Minimum:  2

    }
}
