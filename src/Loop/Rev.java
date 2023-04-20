package Loop;

public class Rev {
    public static void main(String[] args) {
        int num=12345;
        while(num>0){
           int lastD=num%10;
            System.out.println(lastD);
            num=num/10;



        }
        System.out.println("Sum of each digit");
        int sum=0;
        int number=3521;//11
        while(number>0){
            int l=number%10;
            sum=sum+l;
            number=number/10;
        }
        System.out.println(sum);
    }
}
