package Loop;

import java.util.Scanner;

public class PrimeExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number");
        int number= in.nextInt();
        int num=1;
        int counter=0;
        while(number>=num){
            if(number%num==0){
                counter++;
            }
            num++;
        }
        System.out.println("Count of divisors of "+number+" are:"+counter);
        if(counter==2){
            System.out.println("it's prime number");
        }else{
            System.out.println("it's not prime number");
        }
    }
}
