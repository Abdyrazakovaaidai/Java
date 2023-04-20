package Loop;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please  enter some number:");
        int number= input.nextInt();
        int Max=number;
        int Min=number;

        if(number>0){
            while(number>=0){
                 System.out.println("Please enter some number ");
                 number= input.nextInt();
                 if(number<0){
                     break;
                 }
                 if(number>Max){
                     Max=number;
                 }
                 if(number<Min){
                     Min=number;
                 }

             }
        System.out.println("Max= "+Max+" Min= "+Min);
        }else{
            System.out.println(number+"  Invalid Number ");
        }

        //Please  enter some number:
        //3
        //Please enter some number
        //6
        //Please enter some number
        //9
        //Please enter some number
        //-3
        //Max= 9 Min= 3

        }}


