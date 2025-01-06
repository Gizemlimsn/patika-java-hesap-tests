import java.util.Scanner;
public class dongu_sayilar {
    public static void main(String[] args){
        int sayi,toplam=0,sayac=-1;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi=inp.nextInt();
        //Girilen sayı çift ise yazdır for döngüsü
        /*for(int i=1;i<=sayi;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }*/
        //girilen sayı çift ise yazdır while döngüsü
        /*int i=1;
        while(i<=sayi){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }*/

        // Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        for(int i=0;i<=sayi;i++){
            if((i%3==0) && (i%4==0)){
                toplam+=i;
                System.out.println(i);
                sayac++;
            }
        }
        System.out.print("Ortalama: "+toplam/sayac);

        
    }
}
