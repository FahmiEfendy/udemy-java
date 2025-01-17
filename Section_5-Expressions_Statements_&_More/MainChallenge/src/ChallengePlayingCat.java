public class ChallengePlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        return isSummer ? temperature <= 45 && temperature >= 25 : temperature <= 35 && temperature >= 25;
    }
}
