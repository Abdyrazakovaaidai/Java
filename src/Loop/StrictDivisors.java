package Loop;

import java.util.Scanner;

public class StrictDivisors {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter some number: ");
        int num= input.nextInt();
        int sumDivisors=0;

        for(int i=1;i<=num;i++){

                if (num % i == 0) {
                    System.out.println(num + "  can divide by " + i);

                    sumDivisors += i;
                }

        }
            System.out.println("Sum of divisors:  "+sumDivisors);

}}
