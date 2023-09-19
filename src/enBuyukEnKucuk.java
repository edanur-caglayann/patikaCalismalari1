import java.util.Scanner;
public class enBuyukEnKucuk {
    /*
    Java ile klavyeden girilen N tane sayma sayısından
    en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
     */
    public static void main(String[] args) {
        int adet;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac adet sayi gireceksiniz?");
        adet = scanner.nextInt();

        int max=0;
        int min=0;

        for (int i=1; i<=adet; i++){
            System.out.println(i+".sayıyı giriniz.");
            int sayi= scanner.nextInt();

            if (i == 1) {
                max = sayi;
                min = sayi;
            }
            if (sayi > max) {
                max = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }
            }
        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);
        }

    }

