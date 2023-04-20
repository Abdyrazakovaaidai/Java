package Array;

public class Example2 {
    public static void main(String[] args) {
        //Write a program that displays the sum ,product AND average of the elements of
        // an integer array
        int [] numbers={1,2,-3,5,7};
        int sum=0;
        int product=1;// Произведение чисел - это есть результат их умножения
        double average;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
            product=product*numbers[i];
        }
        average=(double) sum/numbers.length;
        System.out.println("Sum of these numbers are "+sum);
        System.out.println("Product: "+product);
        System.out.println("Average: "+average);
        //Sum of these numbers are 12
        //Product: -210
        //Average: 2.4

    }
}
