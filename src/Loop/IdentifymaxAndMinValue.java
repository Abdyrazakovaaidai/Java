package Loop;

import java.util.Scanner;

public class IdentifymaxAndMinValue {
    public static void main(String[] args) {
        //get number from user , process will stop when user enter negative value and then
        // will show which number given from user is Maximum, which one is minimum
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter some number");
        int NumberFromUser= input.nextInt();
        int MaxValue=NumberFromUser;
        int MinValue=NumberFromUser;
        if(NumberFromUser>0){
            while(NumberFromUser>=0){
                NumberFromUser= input.nextInt();
              if(NumberFromUser<0) {
                  break;
              }
              if(NumberFromUser>MaxValue){
                  MaxValue=NumberFromUser;
              }if(NumberFromUser<MinValue){
                  MinValue=NumberFromUser;
                }
            }
            System.out.println("Max= "+MaxValue+"  Min= "+MinValue);
        }else{
            System.out.println("Negative number is invalid");
        }
        //Please enter some number
        //1
        //2
        //3
        //6
        //0
        //-2
        //Max= 6  Min= 0
    }
}
