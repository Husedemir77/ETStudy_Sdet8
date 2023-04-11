package Training.day16;

public class Task3 {
    public static void main(String[] args) {
        String name = "Ahmed";
        int age = 15;
        String result = "";

        if ( name == "Ahmet") {
            if (age < 20) {
                result = "Kayit oldu";
            } else {
                System.out.println("Yas 20 den kücük olmali");
            }
        } else {
            System.out.println("Isim Ahmet degil");
        }

        result = ( name == "Ahmet") ? (age < 20) ? "Kayit oldu"
                : "Yas 20 den kücük olmali" : "Isim Ahmet degil";
        System.out.println(result);

        System.out.println(( name == "Ahmet") ? (age < 20) ? "Kayit oldu"
                : "Yas 20 den kücük olmali" : "Isim Ahmet degil");


    }
}
