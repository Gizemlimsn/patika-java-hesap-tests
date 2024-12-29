
import java.util.Scanner;

public class kullanicisifre {

    public static void main(String[] args) {
        String adi, sifre, sifir;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınzı Giriniz: ");
        adi = inp.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        sifre = inp.nextLine();
        if (adi.equals("patika") && sifre.equals("java123")) {
            System.out.println("Giriş yaptınız.");
        } else {
            if (!adi.equals("patika")) {
                System.out.println("Adınız yanlış.");
            } else if (!sifre.equals("java123")) {
                System.out.print("Şifreniz yanlış. Sıfırlamak istermisiniz? Y/N: ");
                sifir = inp.nextLine();
                if (sifir.equals("Y")) {
                    System.out.println("Yeni Şifrenizi Giriniz: ");
                    sifre = inp.nextLine();
                    if (sifre.equals("java123")) {
                        System.out.print("Şifre oluşturulamadı. Lütfen başka şifre giriniz.");
                    } else {
                        System.out.print("Şifre oluşturuldu.");
                    }
                }
                else if(sifir.equals("N")){
System.out.println("Şifreniz sıfırlanmadı.");
                }
                else{
                    System.out.print("Yanlış bir seçim yaptınız.");
                }
            }

        }
    }
}
