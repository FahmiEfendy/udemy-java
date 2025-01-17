public class Main {
    // void means no data will be returned from method

    public static void main(String[] args) {
        System.out.println("===== MAIN CHALLENGE =====");

        boolean isGameOver = true;
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = calculateScore(isGameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + finalScore);

        // calculateScore(true, 1000, 50, 100);
    }

    public static int calculateScore(
            boolean isGameOver,
            int score,
            int levelCompleted,
            int bonus
    ) {
        System.out.println("===== CALCULATE SCORE =====");

        int finalScore = score;

        if (isGameOver) {
            finalScore += (levelCompleted * bonus);
        }

        return finalScore;
    }
}