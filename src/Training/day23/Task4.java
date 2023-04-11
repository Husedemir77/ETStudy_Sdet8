package Training.day23;

public class Task4 {
    public static void main(String[] args) {
        int x = 5;
        boolean y = x++ == 5 && ++x == 6  || x++ == 8 ;
        System.out.println(x + " " + y);
    }
}
