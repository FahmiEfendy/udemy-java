public class ChallengeSecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, -45));
    }

    public static String getDurationString(int sec) {
        if (sec < 0) {
            return (sec + "s is invalid value, must be a positive value");
        }
        return  getDurationString(sec / 60, sec % 60);
    }

    public static String getDurationString(int min, int sec) {
        if (min < 0) {
            return (min + "m in " + min + "m " + sec + "s is invalid value, must be a positive value");
        } else if (sec < 0) {
            return (sec + "s in " + min + "m " + sec + "s is invalid value, must be a positive value" );
        }
        return (String) (min / 60 + "h " + ((min % 60) + (sec / 60)) + "m " + sec % 60 + "s");
    }
}
