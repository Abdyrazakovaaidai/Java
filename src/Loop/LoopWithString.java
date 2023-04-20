package Loop;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter some text");
        String data= in.nextLine();
        for(int i=0;i<data.length();i++){
            System.out.print(data.charAt(i)+" ");
        }
    }
}
