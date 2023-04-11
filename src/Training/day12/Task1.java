package Training.day12;

public class Task1 {
    public static void main(String[] args) {
        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.
        int vizeNotu = 29;
        int finalNotu = 81;
        double avarage = (vizeNotu*0.40) + (finalNotu*0.60);
        if ( avarage >= 60 ) {
            System.out.println("Matematik dersinden gectiniz, tebrikler..." + avarage);
        } else {
            System.out.println("Matematik dersinden kaldiniz." + avarage);
        }
    }
}
