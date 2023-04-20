package Array;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int data []=new int[5];
        for(int i=0;i< data.length;i++){
            System.out.print("Please enter some number:  ");
            data[i]= input.nextInt();
        }
//        for(int a:data){
//            System.out.print(a); // will show all value inside the array
//        }

        int greatest=data[0];
        for(int b=0;b< data.length;b++){
            if(data[b]>greatest){
                greatest=data[b];
            }
        }
        System.out.println("Greatest Number is: "+greatest);
    }
}
