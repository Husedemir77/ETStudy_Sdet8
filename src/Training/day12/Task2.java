package Training.day12;

public class Task2 {
    public static void main(String[] args) {
        // bir sayinin pozitif negatif oldugunu bulalim  + - 0
        int number = -10;
        if (number > 0) System.out.println(number + " Bu sayi pozitiftir.");
        if (number < 0) System.out.println(number + " Bu sayi negatiftir.");
        if (number == 0) System.out.println(number + " Bu sayi sifirdir, isareti yoktur.");


        if (number > 0) {
            System.out.println(number + " Bu sayi pozitiftir.");
        } if (number < 0) {
            System.out.println(number + " Bu sayi negatiftir.");
        } if (number == 0) {
            System.out.println(number + " Bu sayi sifirdir, isareti yoktur.");
        }

        if (number > 0){
            System.out.println(number + " Bu sayi pozitiftir.");
        } else if (number < 0) {
            System.out.println(number + " Bu sayi negatiftir.");
        }
         else {
            System.out.println(number + " Bu sayi sifirdir, isareti yoktur.");
        }


    }
}
