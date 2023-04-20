package Loop;

import java.util.Scanner;

public class SumDivisor {
    public static void main(String[] args) {
        int sumD=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter some number");
        int N= input.nextInt();
        int number=1;

        while(number<=N){
            if(N%number==0){
                System.out.println("Can divided  "+N+" by: "+number);
                sumD+=number;
            }
            number++;
        }
        System.out.println("Sum of divisors: "+sumD);
    }
}
