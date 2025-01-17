public class ChallengeDecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.175, -3.175)); // true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); // false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); // true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); // false
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.1757)); // true
    }

    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {
        return (int) (firstNumber * 1_000) == (int) (secondNumber * 1_000);
    }
}
