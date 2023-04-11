package Training.day23;

public class Task2 {
    public static void main(String[] args) {
        boolean sart = true;
        int i = 0;

//
//        while (sart) {
//            System.out.println("döngü dönüyor");
//            i++;
//            if (i == 5) {
//                sart = false;
//            }
//        }

        for ( boolean j = true; j ; ) {
            System.out.println("Döngü dönüyor");
            j = isLesen();
        }
    }

    private static boolean isLesen() {
        boolean geriBildirim = true;
        for (int i = 0; i <= 5; i++) {
            if ( i == 5) geriBildirim = false;
        }
        return geriBildirim;
    }
}
