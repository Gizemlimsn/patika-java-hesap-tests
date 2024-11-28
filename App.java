import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik,ort;
        String sonuc;
        Scanner Input=new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        mat=Input.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        fizik=Input.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        kimya=Input.nextInt();
        System.out.print("Türkçe notunu giriniz: ");
        turkce=Input.nextInt();
        System.out.print("Tarih notunu giriniz: ");
        tarih=Input.nextInt();
        System.out.print("Müzik notunu giriniz: ");
        muzik=Input.nextInt();
        ort=(mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalama: "+ort);
        sonuc=(ort>60)?"Geçti":"Kaldı";
        System.out.println(sonuc);
    }
}
