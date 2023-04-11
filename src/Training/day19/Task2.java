package Training.day19;

public class Task2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 9)
         {

            for (int j = 9; j > i; j--) {
                 System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("* " );
            }
            System.out.println();

            i++;
        }
    }
}
