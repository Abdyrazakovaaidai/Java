package OOP;
interface animal {
   void bark();
}
interface dog{
    void eat();
}
interface cat extends animal,dog{

}
class jija implements cat{

    @Override
    public void bark() {

    }

    @Override
    public void eat() {

    }
}

public class Practise {
    public static void main(String[] args) {

    }

}
