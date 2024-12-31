import java.util.Scanner;

public class sinifgecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,toplam=0,girilen=0;
        double ort;

        Scanner input=new Scanner(System.in);
        System.out.print("Matematik Notunu Giriniz: ");
        mat=input.nextInt();
        if(mat>=0 && mat<=100){toplam+=mat; girilen++;}
        System.out.print("Fizik Notunu Giriniz: ");
        fizik=input.nextInt();
        if(fizik>=0 && fizik<=100){toplam+=fizik; girilen++;}
        System.out.print("Türkçe Notunu Giriniz: ");
        turkce=input.nextInt();
        if(turkce>=0 && turkce<=100){toplam+=turkce; girilen++;}
        System.out.print("Kimya Notunu Giriniz: ");
        kimya=input.nextInt();
        if(kimya>=0 && kimya<=100){toplam+=kimya; girilen++;}
        System.out.print("Müzik Notunu Giriniz: ");
        muzik=input.nextInt();
        if(muzik>=0 && muzik<=100){toplam+=muzik; girilen++;}

        ort=toplam/girilen;

        if(ort>55){
            System.out.println("Sınıfı Geçtiniz. Tebrikler.");
        }else{
            System.out.println("Sınıfta Kaldınız. Tekrar Deneyin.");
        }
        System.out.println("Not ortalamanız: "+ort);


    }
}