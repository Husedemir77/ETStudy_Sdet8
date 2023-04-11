package Training.day31;

public class Task3 {
    public static void main(String[] args) {
        String str = "Hello Java";
        String ilkChar = "" + str.charAt(0) ;

        if (ilkChar.equals(ilkChar.toUpperCase())) System.out.println("evet");
        else System.out.println("hayir");



        System.out.println(str.charAt(0) + "".concat(str.charAt(str.length()-1) + "") );
    }
}
