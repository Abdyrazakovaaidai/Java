package StringMethods;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //Write a method that takes a string   returns a new string made of 3 copies
        //        // of the last 2 chars of the original string. The string length will be at least 2.
        //        //extraEnd(“Hi”) → “HiHiHi”
        //        //extraEnd(“Hello”) → “lololo”
        //        //extraEnd(“ab”) → “ababab”
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter some words:  ");
        String user= input.nextLine();
        Exercise2 instance=new Exercise2();
        System.out.println(instance.word(user));

    }
    public String word(String Word){
        String newValue;
        newValue=Word.substring(Word.length()-2);
        return newValue+newValue;
    }
}
