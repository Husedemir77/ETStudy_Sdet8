package Training.day22;

public class Task1 {
    public static void main(String[] args) {
       // ogrenciDefteriBirak();

         String program = ögrenciDefteriBirakVeGelecekHAftaninPrograminiGetir() ;
        System.out.println("nisan ayinin programi = " + program);

    }

    public static void ogrenciDefteriBirak() {
        System.out.println("Defter müdür yardimcisina birakildi.");
    }

    public static String ögrenciDefteriBirakVeGelecekHAftaninPrograminiGetir(){
        System.out.println("Defter müdür yardimcisina birakildi.");
        System.out.println("Müdür yardimcisindan gelecek haftanin programi alindi");
        String gelecekHaftaninProgrami = "Gelecek hafta Programi";
        return gelecekHaftaninProgrami;
    }

}
