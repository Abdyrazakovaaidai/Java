package JavaOcaBook;

public class mentorSession {
    public static void main(String[] args) {
   // 10/5=2
        // get result without / or %
        int number=10;// divident
        int divisor =2;
        Divide(number,divisor);

    }
    public static void Divide(int number,int divisor){
        int counter=0;
        int result=divisor;
       if(divisor>0&&divisor<=number) {
           while (divisor <= 10) {
               divisor += divisor + result;
               counter++;
           }
           System.out.println(counter);
       }else{
           System.out.println("Not divisible");
       }

    }
}
