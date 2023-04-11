package Training.day13;

public class Task1 {
    public static void main(String[] args) {
        // Task of Day:  2 basamakli bir sayiyi ekrana yazi ile yazdirin Example: 28 -> Yirmi sekiz
        int number = 19;
        int birlerBasamagi = number%10;
        int onlarBasamagi = number/10;
        if ( onlarBasamagi == 1) System.out.print("On");
        if ( onlarBasamagi == 2) System.out.print("Yirmi");
        if ( onlarBasamagi == 3) System.out.print("Otuz");
        if ( onlarBasamagi == 4) System.out.print("Kirk");
        if ( onlarBasamagi == 5) System.out.print("Elli");
        if ( onlarBasamagi == 6) System.out.print("Altmis");
        if ( onlarBasamagi == 7) System.out.print("Yetmis");
        if ( onlarBasamagi == 8) System.out.print("Seksen");
        if ( onlarBasamagi == 9) System.out.print("Doksan");

        if ( birlerBasamagi == 1 ) {
            System.out.println("bir");
        } else if ( birlerBasamagi == 2 ) {
            System.out.println("iki");
        } else if ( birlerBasamagi == 3 ) System.out.println("uc");
        else if ( birlerBasamagi == 4 ) System.out.println("dort");
        else if ( birlerBasamagi == 5 ) System.out.println("bes");
        else if ( birlerBasamagi == 6 ) System.out.println("alti");
        else if ( birlerBasamagi == 7 ) System.out.println("yedi");
        else if ( birlerBasamagi == 8 ) System.out.println("sekiz");
        else if ( birlerBasamagi == 9 ) System.out.println("dokuz");

    }
}
