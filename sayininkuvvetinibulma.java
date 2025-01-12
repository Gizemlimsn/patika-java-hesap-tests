import java.util.Scanner;
public class sayininkuvvetinibulma {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz: ");
        n=input.nextInt();
        //2'nin kuvvetlerini bulan program
        /*for(int i=1;i<=n;i*=2){
            System.out.println(i);
        }*/
        //4'ün kuvvetleri
        System.out.print("4'ün Kuvvetleri: ");
        for(int i=1;i<=n;i*=4){
            System.out.print(i+" , ");
        }

        //5'in kuvvetleri
        System.out.println(" ");
        System.out.print("5'in kuvvetleri: ");
        for(int x=1;x<=n;x*=5){
            System.out.print(x+" , ");
        }
    }
}
