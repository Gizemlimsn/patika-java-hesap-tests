import java.util.Scanner;
public class kucuktenbuyuge {
    public static void main(String[] args){
        int a,b,c;
        Scanner giris=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        a=giris.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b=giris.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        c=giris.nextInt();

        if((a<b) && a<c){
            if(b<c){
                System.out.println("a<b<c");
            }else{
                System.out.print("a<c<b");
            }
        }else if((b<a) && (b<c)){
             if(a<c){
                System.out.print("b<a<c");
             }else{
                System.out.print("b<c<a");
             }
        }else{
            if(a<b){
                System.out.print("c<a<b");
            }else{
                System.out.print("c<b<a");
            }
        }
    }
}
