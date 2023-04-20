package Array;

import java.util.Arrays;
import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] positive =new int[6];
        int[] negative =new int[6];

        for(int i=0;i<6;i++){
            System.out.println("Please Enter positive and negative Number");
            int number= in.nextInt();
            if(number<0){
                negative[i]=number;
            }else{
                positive[i]=number;
            }
        }
        //System.out.println("Positive Numbers are: "+positive);
        //System.out.println("Negative Numbers are:  "+negative);
        System.out.println(Arrays.toString(positive));
        System.out.println(Arrays.toString(negative));
    }
}
