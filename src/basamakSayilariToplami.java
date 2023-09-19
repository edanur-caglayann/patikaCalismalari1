

import java.util.Scanner;

public class basamakSayilariToplami {
    /*
    Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        Örnek : 1643 = 1 + 6 + 4 + 3 = 14
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int originalSayi = sayi;

        while (sayi != 0) {
            int basamak = sayi % 10; // Son basamak elde edilir.
            toplam += basamak; // Basamak toplama eklenir.
            sayi /= 10; // Son basamak çıkarılır.
        }

        System.out.println(originalSayi + " sayısının basamaklarının toplamı: " + toplam);
    }
}