package Training.day20;

public class Task3 {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 20;

        System.out.println(sum(number1, number2));

        int sonuc = sum(number1, number2);
        System.out.println(sonuc);
    }
                   // void -> int geri return tipini ifade etmis olduk
    public static int sum(int sayi1, int sayi2) {
        int toplam = sayi1 + sayi2 ;
        return toplam;
    }
}
