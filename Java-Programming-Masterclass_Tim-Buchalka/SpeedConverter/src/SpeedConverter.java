public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        double ONE_MILE_IN_KILOMETER = 1.609;

        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / ONE_MILE_IN_KILOMETER);

    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
