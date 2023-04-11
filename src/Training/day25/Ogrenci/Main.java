package Training.day25.Ogrenci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci();
        Dersleri dersleri1 = new Dersleri();
        Muhasebe muhasebe1 = new Muhasebe();
        ogrenci1.dersleri = dersleri1;
        ogrenci1.muhasebe = muhasebe1;

        ogrenci1.tc = 12345;
        ogrenci1.firstName="Ayse";
        ogrenci1.lastName="Demir";

        ogrenci1.dersleri.ders1 = "Matematik";
        ogrenci1.dersleri.ders2 = "Türkce";
        ogrenci1.muhasebe.kayitFiyati = 2000;
        ogrenci1.muhasebe.indirimMiktari = 200;

        System.out.println(ogrenci1.tc);
        System.out.println(ogrenci1.muhasebe.netFiyat());
    }
}
