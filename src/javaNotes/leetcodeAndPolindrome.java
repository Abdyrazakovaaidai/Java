package javaNotes;

public class leetcodeAndPolindrome {
    public static void main(String[] args) {
        // polindrome Number


        System.out.println(Polindrome());

    }
    public static boolean Polindrome (){
        int x=1221;
        if(x<0|| x%10==0&&x!=0){
            return false;
        }

        int polindrome= 0;
        while(x>polindrome){
            polindrome=polindrome*10+x%10;
            x=x/10;
        }
        return polindrome==x||polindrome/10==x;
    }
}
