public class ChallengeMinutesToYearsAndDays {

    public static void main(String[] args) {
        printYearsAndDays(525_600);
        printYearsAndDays(1_051_200);
        printYearsAndDays(561_600);
    }

    public static void printYearsAndDays(long min) {
        if (min < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int minToYear = 525_600;
        int minToDay = 1_440;
        int year = (int) (min / minToYear);
        int day = (int) (min / minToDay) % 365;
        System.out.println(min + " min = " + year + " y and " + day + " d");
    }
}
