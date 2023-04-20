package JavaOcaBook;

public class Fibonacci {
    public static void main(String[] args) {
       // I would like to get sum of fibonacci number of 10
        // sum of previous number
        //Output:0+1+1+2+3+5+8+13+21+34.....
        int number=10;
        int fibonacci=0;
        int a=0;
        int b=1;
        for(int i=1;i<=number;i++){
            System.out.println(a);// 0,1,1,2,3,5,8,13,21,34
            fibonacci=a+b;//1,2,3,5,8,13,21,34
            a=b;//1,1,2,3,5,8,13,21
            b=fibonacci;//1,2,3,5,8,13,21,34
        }
        System.out.println("////////Second Version/////////////////");

        int numbers=10;
        int n1=0; int n2=1;

        for (int i=1; i<=numbers; i++){
            System.out.println(n1);
            int sum=n1+n2;
            n1=n2;
            n2=sum;
        }


    }
}
