public class Technical1 {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8,13,21,34
        int num1=0,num2=1,sum=0;
        for(int i=0;i<10;i++){
            System.out.println(num1);//0,1
            sum=num1+num2;//1
            num1=num2;//1
            num2=sum;//1
        }
    }
}
