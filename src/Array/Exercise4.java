package Array;

public class Exercise4 {
    public static void main(String[] args) {
        //Write a program that displays the maximum and minimum elements of an array
        int []numbers={3,2,1,5,4};
        int max=numbers[0];
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }if(numbers[i]<min){
                min=numbers[i];
            }

        }
        System.out.println("Max: "+max+"  Min: "+min);
    }
}
