package javaNotes;

import java.util.Arrays;
import java.util.Scanner;

public class Codingbat1 {
    public static void main(String[] args) {
        //This pair13() example method returns true if the int array
        // contains a pair of 13's next to each other.
        Scanner input=new Scanner(System.in);
        int []numFromUser= new int[6];

        for(int i=0;i<6;i++){
            System.out.println("Enter some number: ");
            numFromUser[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(numFromUser));
        int count=0;
        for(int a=0;a<numFromUser.length-1;a++){
            if(numFromUser[a]==13&&numFromUser[a+1]==13){
                count++;
            }
        }
        if(count==1){
            System.out.println(" two pairs of 13");
        }else{
            System.out.println("No");
        }
    }
}
