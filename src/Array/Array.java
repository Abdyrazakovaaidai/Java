package Array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 1D Array
        int data[]={1,2,3,4,5,};// initialization of array
        int data1[]=new int[5];

        System.out.println(data1.length);
        System.out.println(data.length);
        //System.out.println(data[01]);

        // printout all values
        for(int i=0;i<data.length;i++){

            System.out.println(data[i]);
        }
        System.out.println("///////////////////////////////////////////////////////////////////////////////");
        for(int a:data){
            System.out.println(a);
        }
         data1[0]=10;
        data1[1]=20;
        data1[2]=30;
        data1[3]=40;
        data1[4]=50;
        for(int c:data1){
            System.out.println(c);
        }
        System.out.println(Arrays.toString(data1));//[10, 20, 30, 40, 50]



    }

}
