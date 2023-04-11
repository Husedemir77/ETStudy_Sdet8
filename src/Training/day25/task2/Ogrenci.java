package Training.day25.task2;

public class Ogrenci {
    int id;
    String  firtName;
    String  lastName;
    OgrenciVelisi ogrenciVelisi ;

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", firtName='" + firtName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ogrenciVelisi=" + ogrenciVelisi.firstName +
                '}';
    }
}
