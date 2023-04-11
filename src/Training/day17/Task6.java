package Training.day17;

public class Task6 {
    public static void main(String[] args) {
        int carpim = 1;  // 10!= 1.2.3...10 birden 10 a kadar olan tamsayilarin carmipidir 5!=1.2.3.4.5 = 120

        for (int i = 1; i <= 5; i++) {

            if ( i == 4) continue;
            carpim = carpim * i;
            if ( i == 3) break;
            System.out.println(i);
            System.out.println("hallo");

        }

        System.out.println("sonuc = " + carpim);


    }
}
