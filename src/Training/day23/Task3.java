package Training.day23;

public class Task3 {
    public static void main(String[] args) {
        int number1 = 25;
        int number2 = 35;
        int number3 = 46;

        boolean sonuc = lastDigit(number1, number2);
        System.out.println("2 sayinin birler bamamagi esit mi : "+ sonuc);

        boolean sonuc3DegerIcin = lastDigit(number1, number2, number3);
        System.out.println("3 sayinin birler basamagi esit mi : " + sonuc3DegerIcin);

    }

    private static boolean lastDigit(int sayi1, int sayi2) {
        boolean result = false;
        int sayi1BirlerBasamagi = sayi1 % 10;
        int sayi2BirlerBasamagi = sayi2 % 10;
        if (sayi1BirlerBasamagi == sayi2BirlerBasamagi) result = true;
        return result;    }

    private static boolean lastDigit(int sayi1, int sayi2, int sayi3) {
        boolean result = false;
        int sayi1BirlerBasamagi = sayi1 % 10;
        int sayi2BirlerBasamagi = sayi2 % 10;
        int sayi3BirlerBasamagi = sayi3 % 10;
        if (sayi1BirlerBasamagi == sayi2BirlerBasamagi && sayi2BirlerBasamagi == sayi3BirlerBasamagi) result = true;
        return result;
    }
}
