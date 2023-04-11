package Lesson.day14;

public class Task2 {
    public static void main(String[] args) {
        int month = 19;
        String monthName;
        String monthSeason;

        switch (month){
            case 1: monthName = "Ocak"; break;
            case 2: monthName = "Subat"; break;
            case 3: monthName = "Mart"; break;
            case 4: monthName = "Nisan"; break;
            case 5: monthName = "Mayis"; break;
            case 6: monthName = "Haziran"; break;
            case 7: monthName = "Temmuz"; break;
            case 8: monthName = "Agustos"; break;
            case 9: monthName = "Eylül"; break;
            case 10: monthName = "Ekim"; break;
            case 11: monthName = "Kasim"; break;
            case 12: monthName = "Aralik"; break;
            default: monthName = "bu ay ismi ";
        }
        switch (month){
            case 12:
            case 1:
            case 2:
                monthSeason = "kis"; break;
            case 3:
            case 4:
            case 5:
                monthSeason = "ilkbahar"; break;
            case 6:
            case 7:
            case 8:
                monthSeason = "yaz"; break;
            case 9:
            case 10:
            case 11:
                monthSeason = "sonbahar"; break;
            default: monthSeason = "uygun bir mevsim ismi degil";
        }
        if ( month >= 0 && month <= 12) {
            System.out.println(monthName + " ayi " + monthSeason + " mevsimindedir");
        } else {
            System.out.println("bu sayida bir ay mevcut degildir");
        }

    }
}
