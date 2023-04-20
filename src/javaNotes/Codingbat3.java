package javaNotes;

public class Codingbat3 {
    public static void main(String[] args) {
        //Given an int array length 2,
        // return true if it does not contain a 2 or 3.
        int num[]=new int[]{1,2,4,7,8};
        System.out.println(no23(num));
    }
    public static boolean  no23(int [] numbers){
        for(int i=0;i<numbers.length;i++) {
            if (numbers[i] == 2 || numbers[i] == 3) {
                return false;
            }
        }
        return true;

    }
}
