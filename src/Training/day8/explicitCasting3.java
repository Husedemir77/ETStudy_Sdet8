package Training.day8;

public class explicitCasting3 {
    public static void main(String[] args) {
        int int1 = 33000;
        short short1 = (short) int1;

        System.out.println("integer = " + int1);
        System.out.println("short = " + (short1 + 32767));

        short short2 = 130;
        byte byte1 = (byte) short2;

        System.out.println("byte = " + byte1);
        System.out.println( 130 % 127 );

    }
}
