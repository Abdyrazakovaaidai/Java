package StringMethods;

public class String2 {
    public static void main(String[] args) {
        //Write a program to find the number of vowels, consonents,
        // digits and white space characters in a string.
        String word="I like J-Hope and my age is 22";
        int vowel=0;
        int consonant=0;
        int character=0;
        int digit=0;
        int i;
        for(i=0;i<word.length();i++){
        if(word.charAt(i)=='a'||word.charAt(i)=='A'||word.charAt(i)=='i'||
                word.charAt(i)=='I'||word.charAt(i)=='e'||word.charAt(i)=='E'||
                word.charAt(i)=='o'||word.charAt(i)=='O'){
            vowel++;

        }else{
            consonant++;


        }

            System.out.println("it's vowel "+vowel);
            System.out.println("Consonant"+consonant);

    }
}}
