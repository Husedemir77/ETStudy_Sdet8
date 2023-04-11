package Training.day25;

public class Task1 {
    static int top = 0;

    public static void main(String[] args) {
        System.out.println(avarage(2,3,4,5,6));
    }
    public static int avarage(int... abc){
        int index = 0;
        for (int x: abc ) {
           top+=x;
           index++;
        }
        return top/index;



    }
}
