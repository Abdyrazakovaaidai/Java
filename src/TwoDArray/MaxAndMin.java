package TwoDArray;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [][]numbers=new int [4][3];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            System.out.println("Please enter numbers for row "+i);
            for(int j=0;j<numbers[0].length;j++){
                numbers[i][j]=in.nextInt();
                //System.out.println(numbers[i][j]);
                if(numbers[i][j]<min){
                    min=numbers[i][j];
                } if(numbers[i][j]>max){
                    max=numbers[i][j];
                }
            }
            System.out.println("Min Number= "+min);
            System.out.println("Max Number= "+max);
        }
    }
}
