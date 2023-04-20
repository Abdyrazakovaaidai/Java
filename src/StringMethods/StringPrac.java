package StringMethods;

public class StringPrac {
    public static void main(String[] args) {
        //Original String = Java Exercises!
        //The character at position 0 is J
        //The character at position 10 is i
        String original="Java Exercises";
        System.out.println(original.substring(0,1)+"  At 0 index position");
        System.out.println(original.substring(10,11)+"  at position 10");
        int index1=original.charAt(0);
        int index2=original.charAt(10);
        System.out.println("The character at position 0 is   "+(char)index1);



        //Write a program to check if the letter 'e' is present in the word 'Umbrella'.
        String a="Umbrella";
        boolean per=false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='e'){
                per=true;

            }
            }
        System.out.println(per);

        }

}
