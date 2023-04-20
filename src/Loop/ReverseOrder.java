package Loop;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter some number: ");
        int number=in.nextInt();
        while(number>0){
            int N=number%10;
            System.out.println(N);
            number=number/10;
        }
    }
}
