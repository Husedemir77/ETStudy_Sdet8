package Training.day26;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ad ve Soyadinizi Giriniz : ");
        String name = input.nextLine();
        name = name.toUpperCase();
        char ilkHarf = name.charAt(0);
        int nameUzunlugu = name.length();
        char soyadIlkHarf = ' ';
        char ikinciSoyadIlkHarf = ' ';

        for (int i = 0; i < nameUzunlugu; i++) {
            if (name.charAt(i) == ' ') {
                soyadIlkHarf = name.charAt(i+1);
                break;
            }
        }

        for (int i = 0; i < nameUzunlugu; i++) {
            if (name.charAt(i) == ' ') {
                ikinciSoyadIlkHarf = name.charAt(i+1);
            }
        }

        System.out.println( ilkHarf + ". " + soyadIlkHarf + ". " + ikinciSoyadIlkHarf + "." );
    }
}
