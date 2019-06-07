import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while(true) {
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                sum += scanner.nextInt();
                count++;
            } else {
                break;
            }
        }

        System.out.println("SUM = " + sum + " AVG = " + (Math.round((double) sum / count)));
    }
}
