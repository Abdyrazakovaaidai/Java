package Array;

public class Exercise3 {
    public static void main(String[] args) {
        // Writing a program that displays the number of occurrences of an element in the array.
        //[1,1,,1,2,3,4]
        //3 occurs 1 time
        //1 occurs 3 times
        //7 occurs 0 times
        int [] numbers={1,1,1,2,3,4,5};
        int searchElement=1;
        System.out.println(getNumberOcc(numbers,searchElement));

    }
    public static int getNumberOcc(int [] number,int search){
        int occur=0;
        for(int i=0;i<number.length;i++){
            if(search==number[i]){
                occur++;
            }
        }
        return occur;
    }

}
