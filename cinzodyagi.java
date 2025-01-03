import java.util.Scanner;
public class cinzodyagi {
    public static void main(String[] args) {
        int yil;
        String deger="";
        Scanner input=new Scanner(System.in);
        System.out.print("Doğum Yılınzı Giriniz: ");
        yil=input.nextInt();
        switch (yil%12) {
            case 0:
                deger="Maymun";
                break;
            case 1:
                deger="Horoz";
                break;
            case 2:
                deger="Köpek";
                break;
            case 3:
                deger="Domuz";
                break;
            case 4:
                deger="Fare";
                break;
            case 5:
                deger="Öküz";
                break;
            case 6:
                deger="Kaplan";
                break;
            case 7:
                deger="Tavşan";
                break;
            case 8:
                deger="Ejderha";
                break;
            case 9:
                deger="Yılan";
                break;
            case 10:
                deger="At";
                break;
            case 11:
                deger="Koyun";
                break;
            default:
                System.out.print("Yanlış değer girdiniz tekrar deneyin.");;
        }
        System.out.print("Çin Zodyağı Burcunuz: "+deger);
    }
}
