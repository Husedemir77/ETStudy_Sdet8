package Training.day8;

public class explicitCasting2 {
    public static void main(String[] args) {

        double double1 = 38457344398.83473;
        float float1 = (float) double1;
        long long1 = (long) double1;
        int int1 = (int) double1;
        short short1 = (short) double1;
        byte byte1 = (byte) double1;

        System.out.println("double = " + double1);
        System.out.println("float = " + float1);
        System.out.println("long = " + long1);
        System.out.println("int = " + int1);
        System.out.println("short = " + short1);
        System.out.println("byte =" + byte1);



    }
}
