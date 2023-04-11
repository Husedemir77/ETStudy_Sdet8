package Lesson.day14;

public class Task6 {
    public static void main(String[] args) {
        // Task of Day:  2 basamakli bir sayiyi ekrana yazi ile yazdirin Example: 28 -> Yirmi sekiz
        int number = 3241;
        int birlerBasamagi = number%10;
        int onlarBasamagi = number/10;
        if (number >= 10 && number <= 99) {
            switch (onlarBasamagi) {
                case 1:
                    System.out.print("On ");                   break;
                case 2:
                    System.out.print("Yirmi ");                    break;
                case 3:
                    System.out.print("Otuz ");                    break;
                case 4:
                    System.out.print("Kirk ");                    break;
                case 5:
                    System.out.print("Elli ");                    break;
                case 6:
                    System.out.print("Altmis ");                    break;
                case 7:
                    System.out.print("Yetmis ");                    break;
                case 8:
                    System.out.print("Seksen ");                    break;
                case 9:
                    System.out.print("Doksan ");                     break;
            }

            switch (birlerBasamagi) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
            }
        } else System.out.println("Sayi iki basamakli degildir.");

    }
}
