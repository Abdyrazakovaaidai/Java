package javaNotes;

import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {
        // 2 Print integer in java

        for(int c=1;c<=10;c++){
            System.out.println(c);
        }
        //3 Command Line Argument in java
        for(String t:args){
            System.out.println(t);
        }
        //5. How to convert Fahrenheit to Celsius
        // Ноль градусов Цельсия — это 32 градуса Фаренгейта,
        // а градус Фаренгейта равен 5/9 градуса Цельсия.
        float temperature;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit ");
        temperature=in.nextInt();
        temperature=((temperature-32)*5)/9;
        System.out.println("Temperature in Celsius = "+temperature);

        //6.How to swap 2 no using 3rd variable Program
        int x,y,temp;
        System.out.println("Enter x number");
        x=in.nextInt();
        System.out.println("Enter y number");
        y= in.nextInt();
        System.out.println("Before swapping \n x= "+x+"\n y= "+y);
        temp=x;//2
        x=y;//3
        y=temp;
        System.out.println("After swapping \nx= "+x+"\ny="+y);

        //7.How to swap 2 no without using 3rd variable program
        int a,b;
        System.out.println("Enter a and b number");
        a=in.nextInt();//5
        b= in.nextInt();//6
        System.out.println("Before swapping \n a= "+a+"\nb="+b);
        a=a+b;// a(5)+b(6)=11(a)
        b=a-b;// 11-b(6)=5(b)
        a=a-b;// 11(a)-b(5)=6
        System.out.println("After  swapping \n a= "+a+"\n b="+b);

        //8.



    }
}
