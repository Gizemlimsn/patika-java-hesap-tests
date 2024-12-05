import java.util.Scanner;

public class dairecevrealani {
    public static void main(String[] args) {
        //Yarıçapını kullanıcıdan aldığımız dairenin çevresi ve alanını bulan program
        // double yarıçap,cevre,alan,pi=3.14;
        // Scanner Input=new Scanner(System.in);
        // System.out.print("Yarıçapı giriniz: ");
        // yarıçap=Input.nextDouble();
        // cevre=2*pi*yarıçap;
        // alan=pi*Math.pow(yarıçap, 2);
        // System.out.println("Çevre: "+cevre);
        // System.out.println("Alan :"+alan);  

        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        // 𝜋 sayısını = 3.14 alınız.
        // Formül : (𝜋 * (r*r) * 𝛼) / 360

        double r,alani,𝛼,π=3.14;
        Scanner Input=new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        r=Input.nextDouble();   
        System.out.print("Merkez Açısını giriniz: ");
        𝛼=Input.nextDouble();
        alani=(π*Math.pow(r, 2)*𝛼)/360;
        System.out.println("Alanı: "+alani);
    }
}
