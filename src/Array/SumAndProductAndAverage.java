package Array;

public class SumAndProductAndAverage {
    public static void main(String[] args) {
        int [] integers={1,2,3,4,5};
        int sum=0;
        double average=0;
        int product=1;
        for(int i=0;i<integers.length;i++){
            sum=sum+integers[i];
            product=product*integers[i];
        }
        average=sum/integers.length;
        System.out.println("Sum:  "+sum);
        System.out.println("Product: "+product);
        System.out.println("Average: "+average);
        //Sum:  15
        //Product: 120
        //Average: 3.0
    }
}
