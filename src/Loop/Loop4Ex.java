package Loop;

import java.util.Scanner;

public class Loop4Ex {
    public static void main(String[] args) {
        //Write a program which reads a positive number N from the user then indicates if N is prime or not.
        //N is a prime number if it's divisors are only 1 and N
        //Example :
        //3,5,7 -- Prime Numbers
        //10,15 -- not prime
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter some positive number:  ");
        int number=input.nextInt();
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Count of divisors of Number:  "+number+" is: "+count);
        if(count==2){
            System.out.println("it's prime Number");
        }else{
            System.out.println("It's not Prime number");
        }

        }
        
    }


