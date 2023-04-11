package Training.day17;

public class Task2 {
    public static void main(String[] args)
    {
        int tekSayilarinToplami = 0;
        int ciftSayilarinToplami = 1;
        int baslangicSayisi = 100;
        int bitisSayisi = 150;

        for (int i = baslangicSayisi; i <= bitisSayisi ; i++) {
            if ( i % 2 == 0) {
                ciftSayilarinToplami = ciftSayilarinToplami * i;
                // System.out.println( i + " sayisi cift bir sayidir.");
            } else {
                tekSayilarinToplami = tekSayilarinToplami + i;
                // System.out.println( i + " sayisi tek bir sayidir.");
            }

        }
        System.out.println("Tek sayilar toplami = " + tekSayilarinToplami);
        System.out.println("Cift sayilar toplami = " + ciftSayilarinToplami);
    }


}
