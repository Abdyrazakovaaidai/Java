package Loop;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        //Write a program which reads a sequence of positive integers. The program stops when the user
        //fills a negative value and shows the maximum and the minimum of these numbers
        //Example: 6 0 5 7 -1-> max=7, min=0
        //3 9 6 2 1 -2-> max=9, min=1
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter some number:  ");
        int number= input.nextInt();
        int min=number;
        int max=number;
        if(number>=0){
            while(true){
                number= input.nextInt();
                if(number<0){
                   break;
               }
                if(number>max){
                    max=number;
                }
                if(number<min){
                    min=number;
                }
            }
            System.out.println("Max Number ="+max+"   Min Number="+min);
        }else{
            System.out.println(number+" is Invalid");
        }


    }
}
