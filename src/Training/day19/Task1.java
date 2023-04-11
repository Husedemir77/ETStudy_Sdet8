package Training.day19;

public class Task1 {
    public static void main(String[] args) {
        // Ornek- 2  int number = 30  , loop olustur , degisken 20 den fazla oldugu
        // surece "DONGUDEYIM" yazdirin. her bir yazdirma isleminden sonra degiskenin
        // degerini 1 azaltin.

          int number = 30;
//        while ( number >= 20 ){
//            System.out.println("Döngüdeyim" + number);
//            number--;
//        }

        do {
            System.out.println("Döngüdeyim" + number);
            number--;
        } while ( number > 40 );

    }
}
