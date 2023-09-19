import java.util.Scanner;

public class kombinasyon {
    /*
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı
    farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
    N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

    Java ile kombinasyon hesaplayan program yazınız.
    Kombinasyon formülü
    C(n,r) = n! / (r! * (n-r)!)
     */

    public static void main(String[] args) {
        int n,r;

        Scanner scanner = new Scanner(System.in);
        System.out.println("N değerini giriniz:");
        n = scanner.nextInt();
        System.out.println("R değerini giriniz:");
        r = scanner.nextInt();

        int nFaktoriyel=1;
        int rFaktoriyel=1;
        int sFaktoriyel=1; // sFaktoriyel = (n-r)!

        for (int i=1; i<=n; i++){
            nFaktoriyel*=i;
        }

        for (int j=1; j<=r; j++){
            rFaktoriyel*=j;
        }
        if(n>r){
            for (int k=1; k<=(n-r); k++){
                sFaktoriyel*=k;
            }
        }
        else{
            System.out.println("Sonuç hesaplanamaz. R değerinden büyük bir N değeri giriniz.");
        }

        int kombinasyon = (nFaktoriyel)/ ((rFaktoriyel)*(sFaktoriyel));

        System.out.println(kombinasyon);
    }
}
