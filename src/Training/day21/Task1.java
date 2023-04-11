package Training.day21;

import Lesson.day14.Switch_Case_Statement;

public class Task1 {
    public static void main(String[] args) {
        // bir ögrenci kayit programi, " kayit, degisiklik, silme, borc ödeme, cikis " islemleri olacak
        // bunda metodlar ve swicht case kullanalim
        String name = "Ali";
        String istek = "kayit" ;

        switch (istek){
            case "kayit": kayitYap(name);  break;
            case "degisiklik": degisiklikYap(name);  break;
            case "silme": silmeYap();  break;
            case "borc ödeme": borcOdemeYap(); break;
            case "cikis":cikisYap(); break;
        }

    }

    public static void kayitYap(String isim){
        System.out.println(isim + " Kayit yapildi");
    }
    public static void degisiklikYap(String isim){
        System.out.println(isim + " Degisiklik yapildi");
    }
    public static void silmeYap(){
        System.out.println("Kayit silindi");
    }
    public static void borcOdemeYap(){
        System.out.println("Borc ödendi");
    }
    public static void cikisYap(){
        System.out.println("Cikis Yapildi");
    }
}
