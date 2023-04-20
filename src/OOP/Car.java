package OOP;

public class Car {
    static int salary=500;
    Car(int money){
      //salary=money;
        System.out.println(money);
    }
    public void deposit(int N){
        System.out.println(salary-N);
    }

}
