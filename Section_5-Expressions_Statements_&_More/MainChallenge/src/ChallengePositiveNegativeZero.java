public class ChallengePositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(-1);
    }

    public static void checkNumber(int number) {
        String result = "";
        if (number > 0) {
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        } else {
            result = "zero";
        }
        System.out.println(result);
    }
}
