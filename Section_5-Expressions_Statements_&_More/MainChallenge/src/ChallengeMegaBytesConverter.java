public class ChallengeMegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int kiloBytesToMegabytes = 1024;
        int megaBytes = kiloBytes / kiloBytesToMegabytes;
        int restKiloBytes = kiloBytes % kiloBytesToMegabytes;

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + restKiloBytes + " KB");
    }
}
