package Training.day12;

public class Task3 {
    public static void main(String[] args) {
        // Bir otpark ücret hesapalama programı yapılma isteniyor.
        // 0-2 saat ara 5 €, 2-5 arası 10 € , 5 saatten sonra 15 € olarak
        // saat girildiğinde ücreti yazdırınız.

        double warteZeit = 100; // beklenen süre dakika cinsinden
        double hour = warteZeit/60;
        System.out.println(hour);
        if ( hour > 0 && hour < 2 ) System.out.println("ödemeniz gereken miktar 5 €");
        else if ( hour >= 2 && hour < 5 ) System.out.println("ödemeniz gereken miktar 10 €");
        else {
            System.out.println("ödemeniz gereken miktar 15 €");
        };

        String password = "gülden12";
        if ( password.length() < 8 ) System.out.println(" bu uygun bir password olamaz");
        else System.out.println("uygun bir passwordur");


    }
}
