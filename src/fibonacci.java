import java.util.Scanner;

public class fibonacci {
    /*
    Java döngüler ile fibonacci serisi bulan
    program yazıyoruz. Fibonacci serisinin
    eleman sayısını kullanıcıdan alın.

    Fibonacci Serisi Nedir ?
    Fibonacci serisi, her sayının kendinden önceki ile
    toplanması sonucu oluşan bir sayı dizisidir.
    Bu şekilde devam eden bu dizide sayılar birbirleriyle
    oranlandığında altın oran ortaya çıkar, yani bir sayı
    kendisinden önceki sayıya bölündüğünde altın orana
    gittikçe yaklaşan bir dizi elde edilir.

    Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam,
    bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ
    tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:
    9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34

     */

    public static void main(String[] args) {
        int elemanSayisi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Eleman sayısını giriniz.");
        elemanSayisi = scanner.nextInt();

        //0 1 1 2 3 5 8..
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + ", " + b);
        for (int i = 2; i <= elemanSayisi; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }


    }
}
