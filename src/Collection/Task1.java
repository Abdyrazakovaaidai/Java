package Collection;
//Task 1: Write a program to print unique words from the Given String
//Logic hint: Create a two set with one set holding all the words and
// the second set will hold duplicate words and then do set1 - set2
//Example:
//Input - well, collection is very easiest topic in java and it is very useful as well
//Output - collection easiest topic in java and it useful as

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter some text ");
      String FromUser= input.nextLine().replace(","," ");
      String [] Splited=FromUser.split(" ");
      Set<String> Words=new HashSet<>();
      Set<String> duplicate=new HashSet<>();
      for(int i=0;i<Splited.length;i++){
          if(Words.add(Splited[i])){
              Words.add(Splited[i]);
          }else{
              duplicate.add(Splited[i]);
          }
      }
        System.out.println("All words with one duplicate: "+Words);
        System.out.println("Duplicate: "+duplicate);
        Words.removeAll(duplicate);
        System.out.println("Unique words: "+Words);
    }
}
