import java.util.Scanner;

public class kuvvetHesabi {
    /*
    Java döngüler ile girilen sayıya kadar olan
    2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
     */

    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        number = scanner.nextInt();
        /*
        for (int i = 1; i<=number ; i*=2){
                        System.out.println(i);
                }
         */

        for (int i = 0; i<=number; i++){
            int sonuc = (int) Math.pow(2,i);
            System.out.println("2^" + i + " = " + sonuc);
        }

    }
}
