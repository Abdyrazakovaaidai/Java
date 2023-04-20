package Loop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        //Sum of 1+2-3+4+5-6+7+8-9+10
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter some number: ");
//        int Number= in.nextInt();
//        int sum=0;
//        for(int i=1;i<=Number;i++){
//
//            if(i%3==0){
//                sum=sum-i;
//            }else{
//                sum+=i;
//            }
//
//        }
//        System.out.println(sum);


        int sumOf=0;
        int num=10;
        int N=1;
        while(N<=5){
            System.out.println(N);
            System.out.println(num);
            sumOf+=N+num;
            N++;
            num--;
        }
        System.out.println(sumOf);
        System.out.println("//////////////////////////////////");
        //1+2-3+4+5-6+7+8-9+10=19
        int Sum=0;
        for(int i=0;i<=10;i++){
          if(i%3==0){
              Sum-=i;
          }else{
              Sum+=i;
          }
        }
        System.out.println(Sum);


    }
}
