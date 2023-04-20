package StringMethods;

public class Exercise1 {
    public static void main(String[] args) {
        //Given a string of any length, return a new string where the last 2 chars,
        //        // if present, are swapped, so “coding” yields “codign”.
        //        //lastTwo(“coding”) → “codign”
        //        //lastTwo(“cat”) → “cta”
        //        //lastTwo(“ab”) → “ba”
        String str="codign";
        String str1=str.substring(0,str.length()-2)+str.charAt(str.length()-1)+str.charAt(str.length()-2);
        System.out.println("Before: "+str);
        System.out.println("After: "+str1);
    }
}
