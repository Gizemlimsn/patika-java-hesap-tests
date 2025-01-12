import java.util.Scanner;
public class faktoriyel_kombinasyon {
    public static void main(String[] args) {
        //faktoriyel
        /*int n,x=1,i;
        Scanner input=new Scanner(System.in);
        System.out.print("Faktoriyel sayısı: ");
        n=input.nextInt();
        //for ile
        for(i=1;i<=n;i++){
            x=x*i;
        }
        //while ile
        i=1;
        while(i<=n){
            x*=i;
            i++;
        }
        System.out.println(n+" Faktöriyel :"+x);*/

        //Kombinasyon
        int n,r,i,nfak=1,rfak=1,neksirfak=1,total;
        Scanner scan=new Scanner(System.in);
        System.out.print("n eleman sayısını giriniz: ");
        n=scan.nextInt();
        System.out.print("r elemanlı grup için r sayısını giriniz: ");
        r=scan.nextInt();
        for(i=1;i<=n;i++){
            nfak*=i;
        }
        for(i=1;i<=r;i++){
            rfak*=i;
        }
        for(i=1;i<=(n-r);i++){
            neksirfak*=i;
        }
        total=nfak/(rfak*neksirfak);
        System.out.println("C("+n+","+r+")="+total);


    }
}
