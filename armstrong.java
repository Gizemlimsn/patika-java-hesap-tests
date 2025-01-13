import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        //0'dan 1000 e kadar olan armstrong sayılarını bulan program
        /*for(int n=1;n<1000;n++){
        int i=0,total=0,kalan,gecici;
        
        gecici=n;
        while(gecici!=0){
            gecici/=10;
            i++;
        }
        gecici=n;
        while(gecici!=0){
            
            kalan=gecici%10;
            gecici/=10;
            int basamak=1;
            for(int x=1;x<=i;x++){
                basamak*=kalan;
            }
            
            total+=basamak;

            if(total==n){
                System.out.println(n);
            }
        }
    }
        */

        //Verilen sayının basamak sayıları toplamını bulan program
        int total=0,basdeg;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n=input.nextInt();
        while(n!=0){
            basdeg=n%10;
            n/=10;
            total+=basdeg;
        }
        System.out.print("Basamak değerleri toplamı: "+total);
        
        
    }
}
