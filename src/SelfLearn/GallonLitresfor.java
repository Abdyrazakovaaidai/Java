package SelfLearn;

public class GallonLitresfor {
    public static void main(String[] args) {
        double gallons,litres;
        int counter=0;
        for(gallons=1;gallons<=100;gallons++){
            litres=gallons*3.7854;// преобразовать в литры
            System.out.println(gallons+"  галлонам соответствует  "+litres+"   литры");
            counter++;// увеличивает значение счетчика на 1 на каждой итерации цикла
            if(counter==10){// если значение счетчика равно 10 вывести пустую строку
                System.out.println();
                counter=0;// сбросить счетчик строк
            }
        }
    }
}
