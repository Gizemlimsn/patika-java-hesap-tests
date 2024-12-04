import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {
        double tutar, Kdv,oran;
        Scanner Input=new Scanner(System.in);
        System.out.println("Tutarı giriniz");
        tutar=Input.nextDouble();
        oran=(tutar>1000)?8:18;
        Kdv=(tutar*oran)/100;
        tutar=tutar+Kdv;
        System.out.println("KDV: "+Kdv);
        System.out.println("Hesaplanan tutar: "+tutar);
    }
}
