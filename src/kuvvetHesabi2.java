import java.util.Scanner;

public class kuvvetHesabi2 {
    /*
    Java döngüler ile girilen sayıya kadar olan
    4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
     */
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        number = scanner.nextInt();

        for (int i =1; i<=number ; i++){
          int dörtkatlari = (int) Math.pow(4,i);
            System.out.println("4^" + i + " = "+ dörtkatlari);
        }
        for (int j=1; j<=number ; j++){
            int beskatlari = (int) Math.pow(5,j);
            System.out.println("5^" + j + " = "+ beskatlari);
        }
    }
}
