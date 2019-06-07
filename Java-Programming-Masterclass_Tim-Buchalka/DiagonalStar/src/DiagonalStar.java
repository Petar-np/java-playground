public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number) {
                        System.out.print('*');
                    } else {
                        if (j == 1 || j == number) {
                            System.out.print('*');
                        } else if (j == i) {
                            System.out.print('*');
                        } else if (i == (number - j + 1)) {
                            System.out.print('*');
                        } else {
                            System.out.print(' ');
                        }
                    }

                    if (j == number) {
                        System.out.println();
                    }
                }
            }
        }
    }
}
