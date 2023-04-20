package Array;

public class NumberOfOccurance {
    public static void main(String[] args) {
        //Writing a program that displays the number of occurrences of an element in the array.
        //        //[1,1,,1,2,3,4]
        //        //3 occurs 1 time
        //        //1 occurs 3 times
        //        //7 occurs 0 times
        int [] integers={1,2,1,2,3,3,4};
        int searchNumber=4;
        System.out.println(GetUccurance(integers,searchNumber));

    }
    public static int GetUccurance(int a [],int searchN){
        int occur=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==searchN){
                occur++;
            }
        }
        return  occur;
    }
}
