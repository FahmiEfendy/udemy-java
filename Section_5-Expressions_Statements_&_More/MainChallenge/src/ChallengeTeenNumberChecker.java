public class ChallengeTeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19)); // true
        System.out.println(hasTeen(23, 15, 42)); // true
        System.out.println(hasTeen(22, 23, 34)); // false

        System.out.println(isTeen(9)); // false
        System.out.println(isTeen(13)); // true
    }

    public static boolean hasTeen(int first, int second, int third) {
        return (first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (third >= 13 && third <= 19);
    }

    public static boolean isTeen(int first) {
        return (first >= 13 && first <= 19);
    }
}
