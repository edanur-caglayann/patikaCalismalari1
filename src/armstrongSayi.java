import java.util.Scanner;

public class armstrongSayi {
    /*
    Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.

    Armstrong Sayı Nedir ?
    N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
    Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
    1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.

     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin...");
        int number = scanner.nextInt();

        //Sayı string'e çeviriliyor
        String numberToStr = String.valueOf(number);
        //String uzunluğundan faydalanarak basamak sayısı bulunuyor
        int digitCount = numberToStr.length();

        int currentDigit = 0;
        int sum = 0;

        //Basamak sayısı kadar döngü çalışıyor
        for (int i = 0; i < digitCount; i++) {
            //string olan sayının charAt(i) si kullanılarak, ilgili basamak int çeviriliyor ve atanıyor
            currentDigit = Integer.parseInt(String.valueOf(numberToStr.charAt(i)));
            //üst hesabuı yapılıp toplam değişkenine atanıyor
            sum += Math.pow(currentDigit, digitCount);
        }

        //sonuç değerlendirilyor
        if(sum == number){
            System.out.println("Armstrong sayıdır");
        }else{
            System.out.println("Anlamsız");
        }


    }
}
