package TwoDArray;

public class Practise1 {
    public static void main(String[] args) {
        int [][] data={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<data.length;i++){
            System.out.println("At row:  "+(i+1));
            for(int j=0;j<data[i].length;j++){
                System.out.print( data[i][j]);
            }
            System.out.println();
        }
        System.out.println("/////////////////////////////////////////");
        int [][] datas={{1,2,3},{4,5,6},{7,8,9}};

        for(int b=0;b<datas.length;b++){
            int sum=0;
            for(int c=0;c<data[0].length;c++){
                System.out.print(datas[b][c]);
                sum+=datas[b][c];
            }
            System.out.println("Sum Of row "+b+"     ="+sum);
        }
        //123Sum Of row 0     =6
        //456Sum Of row 1     =15
        //789Sum Of row 2     =24

    }
}
