package Training.day22;

public class Task3 {
    public static void main(String[] args) {
        char karakter = 'A';
        //System.out.println( (char) (karakter + 1));

        for (int i = 0; i <= 5; i++) {

            for (int j = 5; j >i ; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print( (char) (karakter) + " ");
                karakter++;

            }
            System.out.println("");
        }
    }
}
