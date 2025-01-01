/*
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */

import java.util.Scanner;
public class etkinlikoner {
    public static void main(String[] Args){
        int degree;
        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık değeri giriniz: ");
        degree=input.nextInt();

        if(degree<5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if(degree>=5 && degree<10){
            System.out.println("Sinemaya gidebilirsiniz.");
        }else if(degree>=10 && degree<=15){
            System.out.println("Sinemaya ya da Piknik etkinliğine gidebilirsin.");
        }else if(degree<=25){
            System.out.println("Piknik etkinliğine gidebilirsin.");
        }else{
            System.out.println("Yüzme'ye gidebilirsin");
        }
    }
}
