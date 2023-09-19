import java.util.Scanner;

public class usluSayi {
    //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.(While Döngüsü)

    public static void main(String[] args) {
        int sayi, us;
        int total=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üssünü almak istediğiniz sayıyı giriniz.");
        sayi = scanner.nextInt();
        System.out.println("Üs ifadesini giriniz.");
        us = scanner.nextInt();


        //3^4 = 3*3*3*3
        int i = 1;
        while(i<= us){
           total*=sayi;
            i++;
        }
        System.out.println("Sonuç:" +total);
    }
}
