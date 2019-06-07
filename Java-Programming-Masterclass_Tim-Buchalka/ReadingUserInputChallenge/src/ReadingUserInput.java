import java.util.Scanner;

public class ReadingUserInput {
    public static int getSumOfTen() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 1;
        while(counter <= 10) {
            System.out.println("Enter Number #" + counter + ":");

            boolean inputValid = scanner.hasNextInt();
            if (inputValid) {
                sum += scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();
        }

        scanner.close();

        return sum;
    }
}
