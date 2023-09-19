public class yildizUcgenYapimi {
    /*
    Java'da döngüler kullanılarak yıldızlar ile üçgen yapıyoruz.

             *
            ***
           *****
          *******
         *********
        ***********
     */

    public static void main(String[] args) {

        for (int i = -1; i < 10; i++) {
            if( i == -1){
                System.out.print(" ");
            }
            for (int j = 0; j < 7-(i/2); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i+1; j++) {
                if(i%2 != 0){
                    System.out.print("*");
                }
            }
            if(i%2 ==0){
                System.out.println("");
            }

        }

    }
}
