package javaNotes;

import java.util.Scanner;

public class CodingBat {
    public static void main(String[] args) {
        // If-Boolean Logic Task 1
        //In this example, the aIsBigger() method should return true if the int parameter a is
        // larger than b by 2 or more. This code uses an if with && ("and") to return true if the condition is met.
        // Alternately, the run falls through to the return-false at the bottom. This is a pretty simple way to do it.
        CodingBat met=new CodingBat();
        System.out.println(met.isBigger(4, 2));


        // String Task 1
        //This twoE() example method returns true if the string contains exactly two 'e' chars.
        System.out.println("Please enter something:  ");
        Scanner input=new Scanner(System.in);
        String str= input.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            String sub=str.substring(i,i+1);
            if(sub.equals("e")){
                count++;
            }
        }
        if(count==2){
            System.out.println("yes contain 2 e");
        }else{
            System.out.println("No");
        }
        System.out.println("///////////Second version////////////");
        System.out.println("enter some word: ");
        String str1= input.nextLine();
        CodingBat twoEE=new CodingBat();
        System.out.println(twoEE.twoE(str1));

    }

   public boolean isBigger(int a,int b){
        if(a>b && (a-b)>=2){
            return true;
        }else{
            return false;
        }
    }
    public boolean twoE(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
}

