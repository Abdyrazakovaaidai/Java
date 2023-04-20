package Array;

public class SumOfArray {
    public static void main(String[] args) {
        int [] num={10,20,40,70,50};
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }
        System.out.println("Sum of array Num is: "+sum);

        /////////////////////// find some index
        int target=40;
        for(int i=0;i<num.length;i++){
            if(num[i]==target){
                System.out.println("Taget Number 40 is in "+i+" index");
            }
        }

        ///////Reverse order
        int Number=12345;
        while(Number>0){
            int lastdigit=Number%10;
            System.out.println(lastdigit);
            Number=Number/10;

        }
        int n=12345;
        int rev=0;

        while(n>0){
            int last=n%10;
            rev=rev*10+last;
            n=n/10;
        }
        System.out.println(rev);//54321
    }
}
