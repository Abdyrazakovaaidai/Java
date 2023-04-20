package Loop;

public class Loop7 {
    public static void main(String[] args) {
        //Write a program which displays a string with a space after each character
        //Example: some text--> s o m e  t e x t
        String str="some text";
        for(int i=0;i<=str.length()-1;i++){
            System.out.print(str.charAt(i)+" ");//s o m e   t e x t
        }

        System.out.println("/////////////////////////////////////////");

        String Name="Aidai";
        for(int a=0;a<=Name.length()-1;a++){
            System.out.print(Name.charAt(a)+"    ");
        }

        int Number=10;
        while(Number>0){
            System.out.println(Number);
            Number--;
        }
    }
}
