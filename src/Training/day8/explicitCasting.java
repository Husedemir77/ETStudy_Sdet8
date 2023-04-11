package Training.day8;

public class explicitCasting {
    public static void main(String[] args) {

        double double1 = 10.99;
        int int1 = (int) double1;  // Explicit Casting - manuel

        double double2 = int1;   // implicit casting - atomatik

        System.out.println("double = " + double1);
        System.out.println("integer = " + int1);


    }
}
