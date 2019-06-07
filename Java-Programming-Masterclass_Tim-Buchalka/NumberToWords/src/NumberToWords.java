public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reveresedNumber = reverse(number);
            int digitsInNumber = getDigitCount(number);
            int digitsInReversedNumber = getDigitCount(reveresedNumber);

            do {
                switch (reveresedNumber % 10) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Zero");
                }
                reveresedNumber /= 10;
            } while (reveresedNumber > 0);

            if (digitsInNumber != digitsInReversedNumber) {
                for (int i = 0; i < (digitsInNumber - digitsInReversedNumber); i++) {
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number > 0);

        return count;
    }
}
