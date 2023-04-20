public class Циклы {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.println(i);//12345
        }
        System.out.println("/////////////////////////////////////////////////////////");
        int calc=5;
        for(int i=1;i<=10;i++){
            System.out.println("5 * "+i+" ="+calc*i);
        }
        System.out.println("//////////////////////////////////////////////////////////");

        //Sum of each digit
        int digit=45645;
        int sum=0;
        for(int a=0;a<=digit;a++){
           int lastdigit=digit%10;
           sum=sum+lastdigit;
           digit=digit/10;
        }
        System.out.println(sum);//24
        System.out.println("/////////////////////////////////////////////////////////////");

        int number=12345;
        int sumOfEachDigit=0;
       while(number>0){
           int l=number%10;
           sumOfEachDigit+=l;
           number/=10;
       }
        System.out.println(sumOfEachDigit);//15
        System.out.println("//////////////////////////////////////////////////////////////////");
        //Sum of 12345678910
        int s=0;
        for(int c=1;c<=10;c++){
            s+=c;
        }
        System.out.println(s);//55

        //Sum of 1+2-3+4+5-6+7+8-9+10
        int ss=0;
        for(int n=0;n<=10;n++){
            if(n%3==0){
                ss-=n;
            }else{
                ss+=n;
            }
        }
        System.out.println(ss);//19

    }

}
