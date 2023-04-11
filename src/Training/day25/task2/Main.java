package Training.day25.task2;

public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.id = 1;
        ogrenci1.firtName = "Emre";
        ogrenci1.lastName = "Demir";
        OgrenciVelisi ogrenciVelisi1 = new OgrenciVelisi();
        ogrenci1.ogrenciVelisi = ogrenciVelisi1;
        ogrenci1.ogrenciVelisi.firstName = "Hasan";
        ogrenci1.ogrenciVelisi.lastName = "Demir";

        System.out.println(ogrenci1.toString());


    }
}
