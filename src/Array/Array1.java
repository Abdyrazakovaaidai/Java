package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int []even=new int[6];
        int [] odd=new int[6];
        for(int i=1;i<6;i++){
            System.out.println("Please enter some number");
            int data= input.nextInt();
            if(data%2==0){
                even[i]=data;
            }else{
                odd[i]=data;
            }
        }
        System.out.println(Arrays.toString(even)+"Even numbers");
        System.out.println(Arrays.toString(odd)+"Odd numbers");
    }
}
