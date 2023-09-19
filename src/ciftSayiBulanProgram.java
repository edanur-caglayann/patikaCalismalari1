import java.util.Scanner;

public class ciftSayiBulanProgram {
    /*
    Java döngüler ile kullanıcının girdiği sayıya
    kadar çift olan sayıları bulan programı yazıyoruz.
     */
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }


        }
    }
}