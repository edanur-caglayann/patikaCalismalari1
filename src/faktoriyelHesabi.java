import java.util.Scanner;

public class faktoriyelHesabi {
    //Pratik - Faktöriyel Hesaplayan Program

    public static void main(String[] args) {
         int s=1;
         int sayi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz:");
        sayi = scanner.nextInt();

        for (int i=1; i<=sayi; i++){
           s *= i;
        }
        System.out.println("Faktöriyel Hesabi:"+s);
    }
}
