package Loop;

public class loopEx3 {
    public static void main(String[] args) {
        //Write a program which displays the sum of the strict divisors of an integer given by the user
        //6-->1+2+3=6
        //10--> 1+2+5=8
        // The strict divisors of a number N are<=N/2
        //if N%i=0, then i is a divisor of N
        int a=15;
        int sum=0;
        for(int i=1;i<=a/2;i++){

         if(a%i==0){
                System.out.print(i+"  ");//1 3 5
                sum+=i;
           }
        }
       System.out.println("Sum Of "+sum);//15  делить на 1+3+5=9
    }
}
