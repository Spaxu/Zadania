package L2Z6;

public class DayChecker {
    public static String dayOfTheWeek(int numberOfTheDay) {

        switch (numberOfTheDay) {
            case 1 -> {
                System.out.println("Monday");
                return "Monday";
            }
            case 2 -> {
                System.out.println("Tuesday");
                return "Tuesday";
            }
            case 3 -> {
                System.out.println("Wednesday");
                return "Wednesday";
            }
            case 4 -> {
                System.out.println("Thursday");
                return "Thursday";
            }
            case 5 -> {
                System.out.println("Friday");
                return "Friday";
            }
            case 6, 7 -> {
                System.out.println("Weekend");
                return "Weekend";
            }
            default -> {
                System.out.println("The is no such a day!");
                return "There is no such a day!";
            }
        }

    }
}
