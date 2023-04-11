package Lesson.day14;

public class Task4 {
    public static void main(String[] args) {
        String weekDay = "alti";
        switch (weekDay){
            case "bir":

            case "iki":

            case "uc":

            case "dört":

            case "bes":
                System.out.println("Bugün günlerden hafta ici bir gündür, yani calisma günüdür"); break;
            case "alti":

            case "yedi":
                System.out.println("Bugün günlerden hafta sonudur, tatil yapiniz"); break;
            default:
                System.out.println("Gecerli bir gün girmediniz");
        }

        System.out.println("Switch islemi bitti");


    }
}
