public class ChallengeBarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp (boolean isBarking, int hour) {
        if (isBarking && (hour < 8 || hour > 22) && (hour >= 0 && hour <= 24)) {
            return true;
        }
        return false;
    }
}
