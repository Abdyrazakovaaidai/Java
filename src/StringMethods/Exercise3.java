package StringMethods;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
//Write a method that takes a string and returns true
// if the string starts with “hi” and false otherwise.
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter something ");
        String input= in.nextLine();
        if(input.startsWith("hi")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        System.out.println("Enter: ");
        String USER=in.nextLine();
        Exercise3.User(USER);

    }
    public static void User(String us){
        if(us.substring(0,5).equals("hello")){
            System.out.println("TRUE");
        }else{
        System.out.println("FALSE");
    }

}}
