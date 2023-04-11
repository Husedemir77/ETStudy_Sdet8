package Training.day17;

public class Task4 {
    public static void main(String[] args) {
        int yediIleBölünenler = 0 ;
        int toplam = 0;

        for (int i = 0; i <= 3000 ; i++) {
            if ( i % 7 == 0){   //  0/7 = 0
                yediIleBölünenler = yediIleBölünenler + 1;
                toplam = toplam + i;
            }
        }
        System.out.println("Yedi ile bölünen sayi adedi : " + yediIleBölünenler);
        System.out.println(toplam);
    }
}
