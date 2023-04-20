package TwoDArray;

public class Exercise3 {
    public static void main(String[] args) {
        //Write a program that prints the sum of each row in a 2D array.
        // Resolve the exercise and print the sum of each column
        int [][] integers={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int i=0;i<integers.length;i++){
            int sum=0;
            for(int j=0;j<integers[i].length;j++){
                sum+=integers[i][j];

            }
            System.out.println("Sum of row "+(i+1)+" ="+sum);
            //Sum of row 1 =10
            //Sum of row 2 =26
            //Sum of row 3 =42
        }

        System.out.println("Resolve the exercise and print the sum of each column: ");
        for(int i=0;i<integers[0].length;i++){
            int Sum=0;
            for(int j=0;j<integers.length;j++){
                Sum+=integers[j][i];
            }
            System.out.println("Sum of column "+(i+1)+" ="+Sum);
        }
    }
}
