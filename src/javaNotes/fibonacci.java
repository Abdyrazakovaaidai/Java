package javaNotes;

public class fibonacci {
    public static void main(String[] args) {
        int Number=10;
        int a=0;
        int b=1;
        for(int i=0;i<Number;i++){
            System.out.println(a);//0,1
            int sum=a+b;//0+1,1+1=2,
            a=b;//a=1
            b=sum;// b=1

        }

    }
}
