package javaNotes;

import java.util.Scanner;

public class Codingbat4 {
    public static void main(String[] args) {
        // Given a string, return a new string where the last 3 chars are now in upper case.
        // If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase()
        // returns the uppercase version of a string.

        Scanner input =new Scanner(System.in);

         String str="Hi there";
         int cut=str.length()-3;
         String front=str.substring(0,cut);// hi th
        String back=str.substring(cut);// ere

        System.out.println("Please enter something");
        String user= input.nextLine();
        if(user.length()<=3){
            System.out.println(user.toUpperCase());
        }else{
            int cuts=user.length()-3;
            String firstFront=user.substring(0,cuts);
            String backend=user.substring(cuts);
            System.out.println(firstFront+backend.toUpperCase());
        }
        



    }
}
