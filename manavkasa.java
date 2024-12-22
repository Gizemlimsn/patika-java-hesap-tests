import java.util.Scanner;

public class manavkasa {
    public static void main(String[] args){
        double armut ,elma ,domates ,muz ,patlican,toplam;
        Scanner Input=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        armut=Input.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        elma=Input.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        domates=Input.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        muz=Input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican=Input.nextDouble();

        toplam=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5);
        System.out.println("Toplam Tutar : "+toplam+" TL");
    }
    
}
