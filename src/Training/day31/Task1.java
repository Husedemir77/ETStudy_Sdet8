package Training.day31;


public class Task1 {
    public static void main(String[] args) {

        String ezCumle = "Kararmış ruhlarin ali veli dag tepe bayir bakışları arasında her gün affederek yürüyorum; Yazar: Ismet Gunes";

        String[] kelimeler = ezCumle.split(" ");
        System.out.println(kelimeler.length);
        for ( String str : kelimeler ) {
            System.out.println(str);
        }
        char yazarinAdiIlkHarfi = kelimeler[kelimeler.length-2].charAt(0);
        char yazarinSoyadIlkHarfi = kelimeler[kelimeler.length-1].charAt(0);

        System.out.println(yazarinAdiIlkHarfi + "." + yazarinSoyadIlkHarfi + ".");
    }

}
