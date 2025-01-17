public class ChallengeSpeedConverter {
    // 1 km == 0,621371 miles

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(95.75);
    }

    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) return -1;

        double milesToKm = 1.609d;
        double kmToMiles = 1 / milesToKm;

        return Math.round(kilometersPerHour * kmToMiles);
    }

    public static void printConversion (double kilometersPerHour) {
        double miles = toMilesPerHour(kilometersPerHour);

        if (miles < 0) {
            System.out.println("Invalid Value");
        } else {
        System.out.println(kilometersPerHour + " km/h = " + (int) miles + " mi/h");
        }
    }
}
