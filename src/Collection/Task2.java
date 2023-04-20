package Collection;
//Task 2: Write a program to print the frequency of each character from the String -
// Do not use direct method from the Collections class
//Example
//Input - This is my collection program
//Output - { =4, a=1, c=2, e=1, g=1, h=1, i=3, l=2, m=2, n=1, o=3, p=1, r=2, s=2, t=2, y=1}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
    String word="This is my collection program".toLowerCase();
        Set<Character> set=new HashSet<>();
        Map<Character,Integer> frequency=new HashMap<>();
        for(int i=0;i<word.length();i++){
            if(set.add(word.charAt(i))){
                frequency.put(word.charAt(i),1);
            }else{
                frequency.put(word.charAt(i),frequency.get(word.charAt(i))+1);
            }

        }
        System.out.println(frequency);
        //{ =4, a=1, c=2, e=1, g=1, h=1, i=3, l=2, m=2, n=1, o=3, p=1, r=2, s=2, t=2, y=1}


        System.out.println("////////////Second Version///////////////////////////////////");
        // I like mountain
        //{ =2, a=1, t=1, e=1, u=1, i=3, k=1, l=1, m=1, n=2, o=1}


        String str="I like mountain".toLowerCase();
        Map<Character,Integer> freq=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(freq.get(ch)==null){
                freq.put(ch,1);
            }else{
                freq.put(ch,freq.get(ch)+1);
            }
        }
        System.out.println(freq);

    }
}
