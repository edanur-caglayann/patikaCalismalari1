import java.util.Scanner;

public class ciftSayi {
        /*
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
    3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
     */

    public static void main(String[] args) {
        int number;
        int keep=0; //Bölünen sayıların toplamı
        int counter=0; //Bölünen sayıların adedi
        double ortalama;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        number = scanner.nextInt();

        for (int i=0; i<=number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                keep = keep + i;
                counter++;
            }
        }
        if(counter>0){
            ortalama= (double)keep/counter;
            System.out.println("Ortalama: "+ ortalama);
        }

    }
}
