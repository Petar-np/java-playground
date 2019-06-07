public class SharedDigit {
    public static boolean hasSharedDigit(int numOne, int numTwo) {
        if (numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99) {
            return false;
        }

        int numOneCopy = numOne;
        int numTwoCopy;
        boolean hasSharedDigit = false;
        int lastDigitOne;
        int lastDigitTwo;

        while (numOneCopy != 0) {
            lastDigitOne = numOneCopy % 10;
            numTwoCopy = numTwo;
            numOneCopy /= 10;
            while (numTwoCopy != 0) {
                lastDigitTwo = numTwoCopy % 10;
                numTwoCopy /= 10;
                if (lastDigitOne == lastDigitTwo) {
                    hasSharedDigit = true;
                    break;
                }
            }
        }

        return hasSharedDigit;
    }
}
