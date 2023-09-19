import java.util.Scanner;
public class kdvHesaplama {



        public static void main(String[]args){
        /*
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        ( Not : KDV tutarını 18% olarak alın)

        KDV'siz Fiyat = 10;

        KDV'li Fiyat = 11.8;

        KDV tutarı = 1.8;

        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */

            double para ;

            Scanner scanner= new Scanner(System.in);
            System.out.println("Para miktarınızı giriniz:");
            para = scanner.nextDouble();

            if(para>=0 && para<=1000){
                double kdvOran= 0.18 ;
                double kdvTutarii= (para)*kdvOran;
                double kdvliTutari = kdvTutarii+para;
                System.out.println("KDV'siz Fiyat ="+para);
                System.out.println("KDV Oranı ="+kdvOran);
                System.out.println("KDV Tutarı ="+kdvTutarii);
                System.out.println("KDV'li Fiyat ="+kdvliTutari);
            }
            else {
                double kdvOran= 0.8 ;
                double kdvTutarii= (para)*kdvOran;
                double kdvliTutari = kdvTutarii+para;
                System.out.println("KDV'siz Fiyat ="+para);
                System.out.println("KDV Oranı ="+kdvOran);
                System.out.println("KDV Tutarı ="+kdvTutarii);
                System.out.println("KDV'li Fiyat ="+kdvliTutari);
            }
        }
    }

