package Training.day17;

public class Task3 {
    public static void main(String[] args) {
        int birSayisi = 1;

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(birSayisi + " * " + i + " = " + (birSayisi*i) );
        }
        System.out.println();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println((birSayisi+1) + " * " + i + " = " + ((birSayisi+1)*i) );
        }
        System.out.println();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println((birSayisi+2) + " * " + i + " = " + ((birSayisi+2)*i) );
        }


    }
}
