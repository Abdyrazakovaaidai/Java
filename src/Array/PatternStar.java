package Array;

public class PatternStar {
    public static void main(String[] args) {
//              *
//        //   ***
//        //  *****
//        // *******
//        //*********

        for(int i=1;i<=5;i++){

            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int star=1;star<=i*2-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 6.  Write a program to print the below pattern
        //        // *********
        //        //  *******
        //        //   *****
        //        //    ***
        //        //     *

        for(int a=5;a>=1;a--){
            for(int b=1;b<=5-a;b++){
                System.out.print(" ");
            }
            for(int c=1;c<=a*2-1;c++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
