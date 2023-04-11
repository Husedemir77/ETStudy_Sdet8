package Lesson.day14;

public class Task3 {
    public static void main(String[] args) {
        // bugün günlerden persembedir 100 gün sonra hangi gündür
        int hesGunSayiyi = 100;
        int kalanGunSayisi = hesGunSayiyi % 7;
        String yeniGun = "" ;

        switch (kalanGunSayisi){
            case 1: yeniGun = "Cuma"; break;
            case 2: yeniGun = "Cumartesi"; break;
            case 3: yeniGun = "Pazar"; break;
            case 4: yeniGun = "Pazartesi"; break;
            case 5: yeniGun = "Sali"; break;
            case 6: yeniGun = "Carsamba"; break;
            case 0: yeniGun = "Persembe"; break;
        }

        System.out.println(hesGunSayiyi + " gün sonra, günlerden " + yeniGun + " \' dir");

    }
}
