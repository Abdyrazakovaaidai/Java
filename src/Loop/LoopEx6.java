package Loop;

import java.util.Scanner;

public class LoopEx6 {
    public static void main(String[] args) {
        // Write a program which displays the sum of digit of an integer read from the user
        //Example:108-->1+0+8=9
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter some number");
        int num= input.nextInt();

        int sum=0;
        while(num>0){
          int lastD=num%10;
          sum+=lastD;
            num=num/10;
        }
        System.out.println("Sum="+sum);
    }
}
