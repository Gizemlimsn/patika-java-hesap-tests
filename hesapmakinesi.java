
import java.util.Scanner;

public class hesapmakinesi {

    public static void main(String[] args) {
        int n1, n2, secim;
        Scanner Input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = Input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2=Input.nextInt();
        System.out.println("İşlem numarası seçiniz: \n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        secim=Input.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Toplama: "+(n1+n2));                
                break;
            case 2:
                System.out.println("Çıkarma: "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma: "+(n1*n2));
                break;
            case 4:
                if(n1!=0 & n2!=0){
                    System.out.println("Bölme: "+(n1/n2));
                }else{System.out.println("0 sayısı ile bölme işlemi yapılamaz.");}
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız. Tekrar deneyiniz.");
        }

    }
}
