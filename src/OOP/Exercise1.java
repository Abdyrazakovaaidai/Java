package OOP;

public class Exercise1 {
    public static void main(String[] args) {
        Car obj=new Car(200);
        obj.deposit(100);
        System.out.println(Car.salary);
        Car obj1=new Car(1);
        System.out.println(Car.salary);

    }
}
