import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        //taksimetre açılışı 10 TL her gidilen km'de 2,20 artış,20 TL altı ise sabit fiyat 20 TL.
        double km,taksimetre=10;
        Scanner Veri=new Scanner(System.in);
        System.out.print("Gidilen km'yi giriniz: ");
        km=Veri.nextDouble();
        taksimetre+=(km*2.20);
        taksimetre=(taksimetre<20)?20:taksimetre;
        System.out.print("Ödenecek Tutar: "+taksimetre);
    }
}
