import java.util.Scanner;

public class harmonikSayi {
    //Java ile girilen sayının harmonik serisini bulan program yazacağız.
    public static void main(String[] args) {

        int s;
        double toplam=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz.");
        s = scanner.nextInt();

        for (double i=1; i<=s; i++){
            toplam+=1/i;
        }
        System.out.println("Toplam:" +toplam);
    }
}
