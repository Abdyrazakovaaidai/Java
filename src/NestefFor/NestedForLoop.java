package NestefFor;

public class NestedForLoop {
    public static void main(String[] args) {
        //A loop can be nested inside another loop
        // Nested loops consists of an outer loop and one or more inner loops
        //Each time the outer loop is executed the inner loops are executed again

        for(int i=1;i<=3;i++){
            for(int j=1;j<=4;j++){
                System.out.println(i+" "+j);
            }
            System.out.println();
        }

        for(int a=1;a<=5;a++){

            for(int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println();
        }
        //*
        //**
        //***
        //****
        //*****
    }
}
