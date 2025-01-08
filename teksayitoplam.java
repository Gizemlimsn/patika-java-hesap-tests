import java.util.Scanner;
public class teksayitoplam {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner input=new Scanner(System.in);
        //Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan program
       /*  do { 
            System.out.print("Sayı Giriniz: ");
            sayi=input.nextInt(); 
            if(sayi%2==1) {toplam+=sayi;}
        } while (sayi>0);
            System.out.print("Toplam: "+toplam);*/
        
        do { 
            System.out.print("Sayı Giriniz: ");
            sayi=input.nextInt();
            if(sayi%4==0){
                toplam+=sayi;
            }
        } while (sayi%2==0);
        System.out.print("Toplam: "+toplam);
    }
}
