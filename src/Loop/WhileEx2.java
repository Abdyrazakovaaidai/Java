package Loop;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        while(sum<=100){
            System.out.print("Enter a number:  ");
            int number=s.nextInt();
            sum=sum+number;
            //sum+=s.nextInt(); short
        }
        System.out.println("Done: "+sum);

        //Enter a number:  20
        //Enter a number:  20
        //Enter a number:  20
        //Enter a number:  20
        //Enter a number:  40
        //Done 120

        int Summmmmmm=0;
        while(Summmmmmm<=50){
            System.out.println("Enter some number");
            int user=s.nextInt();
            Summmmmmm+=user;
        }
        System.out.println("Sum of:  "+Summmmmmm);
    }
}
