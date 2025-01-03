
import java.util.Scanner;

public class ucakbileti {

    public static void main(String[] args) {
        int km, yas, tip;
        double fiyat=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz: (1 => Tek yön , 2 => Gidiş-Dönüş): ");
        tip = input.nextInt();
        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            fiyat = km * 0.10;
            if (yas < 12) {
                fiyat = fiyat - (fiyat * 0.50);
            } else if (yas > 12 && yas < 24) {
                fiyat = fiyat - (fiyat * 0.10);
            } else if (yas > 65) {
                fiyat = fiyat - (fiyat * 0.30);
            }
            switch (tip) {
                case 2:
                    fiyat = fiyat - (fiyat * 0.20);
                    fiyat = fiyat * 2;
                    break;
                default:
                    System.out.print("Hata Oluştu !");
            }
        } else {
            System.out.print("Hatalı Veri Girdiniz !");
        }
        System.out.print("Toplam Tutar: " + fiyat + " TL");

    }

}
