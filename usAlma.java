import java.util.Scanner;
public class usAlma {
    public static void main(String[] args) {
        int x, n, total = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayınızı giriniz: ");
        x = scan.nextInt();
        System.out.print("Üstünü giriniz: ");
        n = scan.nextInt();
        //while ile
      /*int i=1;
        while (i <= n) {
            total *= x;
            i++;
        }*/
        //for ile
        for(int i=1;i<=n;i++){
            total*=x;
        }
        System.out.println(x+" ^ "+n+" işleminin sonucu: " + total);
    }
}
