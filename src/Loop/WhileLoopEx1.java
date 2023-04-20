package Loop;

import java.util.Scanner;

public class WhileLoopEx1 {
    public static void main(String[] args) {
        // check if the number between 1 -10
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter some number");
        int n=input.nextInt();
        while(n<1||n>10){
            System.out.println(n+ " is not between 1 and 10. Try again: ");
            System.out.println("Please Enter number between 1 and 10 ");
             n=input.nextInt();
        }
        System.out.println(n+"  is between 1 and 10. ");
    }
}
