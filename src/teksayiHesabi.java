import java.util.Scanner;

public class teksayiHesabi {
    /*
    Java döngüler ile tek bir sayı girilene
    kadar kullanıcıdan girişleri kabul eden ve
    girilen değerlerden çift ve 4'ün katları olan
    sayıları toplayıp ekrana basan programı yazıyoruz.
     */

    public static void main(String[] args) {
        int number;
        int keep=0;

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Sayıyı giriniz:");
            number = scanner.nextInt();
            if(number % 4 == 0){
                keep+=number;
            }
        }
        while (number % 2 == 0);
        System.out.println("Toplam -->" +keep);
    }
}
