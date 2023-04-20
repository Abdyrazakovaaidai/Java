public class loop {
    public static void main(String[] args) {
        /// identify how many odd or even number
        int odd = 0;
        int even = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.println("Sum of Even number " + even);
        System.out.println("Sum of Odd number " + odd);

        System.out.println("///////////////");
        int od = 0;
        int ev = 0;
        int number = 123456;
        while (number > 0) {
            int last = number % 10;
            if (last % 2 == 0) {
                ev++;
            }
                if (last % 2 != 0) {
                    od++;
                }
                number /= 10;
        }
        System.out.println("even " + ev);//3
        System.out.println("odd " + od);//3

        // To find sum of 10+1+9+2+8+3+7+4+6+5;
        int sum=0;
        int a=10;
        for(int b=1;b<=5;b++){
            System.out.println(a);
            System.out.println(b);
            sum+=b+a;
            a--;

        }
        System.out.println(sum);//55
        System.out.println("/////////////////////////////////////////////////////////////////////////");

        //To find out sum Of 1+10+2+9+3+8+4+7+5+6

        int s=0;
        int c=10;
        for(int num=1;num<=5;num++){
            System.out.println(num);
            System.out.println(c);
            s+=num+c;
            c--;
        }
        System.out.println(s);


    }
}
