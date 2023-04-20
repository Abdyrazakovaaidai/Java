package Loop;

import java.util.Scanner;

public class Forloopprac {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter some Number: ");
        int User= input.nextInt();
        int SumOfDivisors=0;
        for(int i=1;i<=User;i++){
            if(User%i==0){
                System.out.println(User+" Number can divided by "+i);
                SumOfDivisors+=i;
            }
        }
        System.out.println("Sum Of divisors is: "+SumOfDivisors);

        //Please enter some Number: 15
        //15 Number can divided by 1
        //15 Number can divided by 3
        //15 Number can divided by 5
        //15 Number can divided by 15
        //Sum Of divisors is: 24

        //Strict divisor
        // for(int i=1;i<=User/2;i++)
        //Please enter some Number: 15
        //15 Number can divided by 1
        //15 Number can divided by 3
        //15 Number can divided by 5
        //Sum Of divisors is: 9
    }
}
