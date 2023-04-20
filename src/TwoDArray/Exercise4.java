package TwoDArray;

public class Exercise4 {
    public static void main(String[] args) {
        //Write a program that prints the maximum of each row in a 2D Array
        int [][] integers={{1,10,3,8},{9,12,6,7},{5,2,11,4}};
        for(int i=0;i<integers.length;i++){
            int max= integers[i][0];
            for(int j=1;j<integers[0].length;j++){
               // max=(integers[i][j]>max)? integers[i][j]:max;
                if(integers[i][j]>max){
                    max=integers[i][j];
                }

            }
            System.out.println("Row "+(i+1)+" :"+max);
        }
    }
}
