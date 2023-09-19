import java.util.Scanner;

public class tekSayiToplami {
    /*
    Java döngüler ile negatif bir değer girilene
    kadar kullanıcıdan girişleri kabul eden ve
    girilen değerlerden tek sayıları toplayıp ekrana
    basan programı yazıyoruz.
     */

    public static void main(String[] args) {
        int number;
        int keep =0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Sayıyı giriniz.");
            number = scanner.nextInt();
            if (number%2==1){
                keep+=number;
            }
        }
            while (number>0);
        System.out.println("Toplam:"+keep);
        }

    }

