package NestefFor;

public class Ex1 {
    public static void main(String[] args) {
        for(int i=1;i<3;i++){
            System.out.println("Outer loop");
            for(int j=1;j<=5;j++){
                System.out.println("Inner loop");
            }
        }
    }
}
