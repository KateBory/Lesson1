public class MySwitch {
    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }
    
    public static void main(String[] args) {
        Season season = Season.WINTER;
        String month = "may";
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
            default:
                System.out.println("Enter right month");

        }
        System.out.println(season);
    }

}
