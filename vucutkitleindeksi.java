import java.util.Scanner;

public class vucutkitleindeksi {
    public static void main(String[] args){

        // Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        // Formül
        // Kilo (kg) / Boy(m) * Boy(m)
        double boy, kilo,indeks;
        Scanner Input=new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz: ");
        boy=Input.nextDouble();
        System.out.print("Kilonuzu Giriniz: ");
        kilo=Input.nextDouble();
        indeks=kilo/Math.pow(boy, 2);
        System.out.println("Vücut Kitle İndeksi: "+indeks);
    }
}
