public class MethodChallenge {
    public static void main(String[] args) {
        System.out.println("==== METHOD CHALLENGE MAIN =====");

        int playerScore = 1001;
        int highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition("Player One", highScorePosition, playerScore);

        playerScore = 999;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition("Player Two", highScorePosition, playerScore);

        playerScore = 499;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition("Player Three", highScorePosition, playerScore);

        playerScore = 99;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition("Player Four", highScorePosition, playerScore);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition, int playerScore) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " with score " + playerScore + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int result = 4;
        if (playerScore >= 1000) {
            result = 1;
        } else if (playerScore >= 500) {
            result = 2;
        } else if (playerScore >= 100) {
            result = 3;
        }

        return result;
    }
}
