import java.util.Scanner;

public class atm {
    /*
    Java döngüler ile kullanıcının banka hesabını
     yönetebildiği bir ATM projesi yapıyoruz.
     */
    public static void main(String[] args) {
        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int right = 3; //Kullanıcının bilgileri girmesi için 3 hakkı olsun
        int balance = 1200;
        int select;

        while (right > 0) { //Giriş yapma hakkı olduğu sürece bilgileri alınsın.
            System.out.println("Kullanıcı Adınız : ");
            userName = scanner.nextLine();
            System.out.println("Parolanız : ");
            password = scanner.nextLine();

            if (userName.equals("Edanur") && password.equals("1234")) {
                System.out.println("Merhaba, Bankamıza Hoşgeldiniz.");

                do {
                    System.out.println(
                            "1-Para Yatırma\n" +
                                    "2-Para Çekme\n" +
                                    "3-Bakiye Sorgula\n" +
                                    "4-Çıkış Yap");
                    select = scanner.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Para miktarı : ");
                            int price = scanner.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.println("Para miktarı : ");
                            price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        default:
                            break;
                    }
                }
                while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }

        }
    }
}
