import java.util.Scanner;

public class usluSayiHesabi2 {
    //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
    public static void main(String[] args) {
        int sayi, us;
        int total=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üssünü almak istediğiniz sayıyı giriniz.");
        sayi = scanner.nextInt();
        System.out.println("Üs ifadesini giriniz.");
        us = scanner.nextInt();


        //3^4 = 3*3*3*3
        for (int i = 1; i<= us; i++){
            total*=sayi;
        }
        System.out.println("Sonuç:" +total);
    }
}
