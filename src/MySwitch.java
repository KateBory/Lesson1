import java.util.Scanner;

public class MySwitch {
    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) {
        System.out.println("Enter month");
        Scanner str = new Scanner(System.in);
        String month = str.nextLine();

        Season season = null;

        switch (month.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                season = Season.WINTER;
                break;
            case "march":
            case "april":
            case "may":
                season = Season.SPRING;
                break;
            case "june":
            case "july":
            case "august":
                season = Season.SUMMER;
                break;
            case "september":
            case "october":
            case "november":
                season = Season.AUTUMN;
                break;
            default:
                System.out.println("No this month");

        }
        if (season != null)
            System.out.println(season);
    }

}
