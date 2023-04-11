package Training.day31;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] sayilar = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            sayilar[i] = random.nextInt(51) + 50;
        }

        for (int number: sayilar) {
            System.out.print(number + "  ");
        }
    }
}
