package Training.day17;

public class Task1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100 ; i++) {
            if ( i % 2 == 0) {
                System.out.println( i + " sayisi cift bir sayidir.");
            } else {
                System.out.println( i + " sayisi tek bir sayidir.");
            }

        }
        System.out.println("döngü bitti");
    }
}
