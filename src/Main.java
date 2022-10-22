import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     Flower rose=new Flower("роза обыкновенная","голандия",35.99);
     rose.information();
     Flower hrizant=new Flower("Хризантема", 15 ,5);
     hrizant.information();
     Flower pion=new Flower("Пион","Англия",69.9,1);
     pion.information();
     Flower gipsof=new Flower("Гипсофила","Турция",19.5,10);
     gipsof.information();
     
   double calculation= rose.getCost()+ pion.getCost()+ hrizant.getCost();
   double sum=(calculation*0.1)+calculation;

   int[] flover = {rose.lifeSpan, pion.lifeSpan, hrizant.lifeSpan};
   int min=Arrays.stream(flover).min().getAsInt();


        System.out.println("Букет состоит из: "+rose.name+", "+pion.name+", "+hrizant.name+". ");
        System.out.printf(" Стоимость букета составляет "+sum+" руб. ");
        System.out.println(" Срок стояния "+ min+" дней");


         
        }

    }
