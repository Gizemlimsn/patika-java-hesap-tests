import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        //Dik üçgende hipotenüs bulan program
        int kenar1,kenar2;
        double hipotenus;
        Scanner Input=new Scanner(System.in);
        System.out.print("Dik kenarlardan birini giriniz: ");
        kenar1=Input.nextInt();
        System.out.print("Dik kenarlardan diğerini giriniz: ");
        kenar2=Input.nextInt();
        hipotenus=Math.sqrt(kenar1*kenar1+kenar2*kenar2);
        System.out.println("Hipotenüs: "+hipotenus);

        // Üç kenar uzunluğu bilinen üçgenin alanı

        //         Formül
        // Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        // 𝑢 = (a+b+c) / 2

        // Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        int a,b,c ,cevre;
        double u, alan;
        System.out.print("A kenarı:");
        a=Input.nextInt();
        System.out.print("B kenarı:");
        b=Input.nextInt();
        System.out.print("C kenarı:");
        c=Input.nextInt();
        cevre=a+b+c;
        u=cevre/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Cevre: "+cevre+" Alan: "+alan);

    }
}
