public class MySwitch {

    public static void main(String[] args) {
        String month = "JuLy";
        switch (month.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                System.out.println("Winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("Summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("Autumn");
            default:
                System.out.println("Enter right month e.g.: May");


        }
    }

}
