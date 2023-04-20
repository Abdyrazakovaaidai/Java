package javaNotes;

import java.math.BigInteger;//For large Number
import java.util.Scanner;


public class prac2 {
    public static void main(String[] args) {
        //8.How to add two number program
//        int x,y,z;
//        System.out.println("Enter two integers to calculate their sum ");
//        Scanner in=new Scanner(System.in);
//        x=in.nextInt();
//        y=in.nextInt();
//        z=x+y;
//        System.out.println("Sum of entered integers ="+z);

        System.out.println("//////////////////////////");

        ///////Adding Large Numbers
        String number1,number2;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first large number");
        number1=in.nextLine();
        System.out.println("Enter second large number");
        number2=in.nextLine();
        BigInteger first=new BigInteger(number1);
        BigInteger second=new BigInteger(number2);
        BigInteger sum;
        sum=first.add(second);
        System.out.println("Result of addition="+sum);
    }

}
