package Lesson.day14;
public class Switch_Case_Statement {
    public static void main(String[] args) {
        String city = "Agri";

        // sehirlere göre deprem durumunu belirliyor
        switch (city){
            case "Ankara":
                System.out.println("bu sehirde deprem olmamistir");
                break;
            case "Adiyaman":
                System.out.println("bu sehirde deprem yasanmistir");
                System.out.println("bu sehirde 4000 kisi vefat etmistir");
                break;
            case "Hatay":
                System.out.println("bu sehirde deprem olmustur");
                break;
            default:
                System.out.println("bu sehirde deprem riski yoktur"); break;
        }
    }
}
