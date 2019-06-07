public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int MB_IN_KB = 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes +" KB = " + kiloBytes / MB_IN_KB + " MB and " + kiloBytes % MB_IN_KB + " KB");
        }
    }
}
