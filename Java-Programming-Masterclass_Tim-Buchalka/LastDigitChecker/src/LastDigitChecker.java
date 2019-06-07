public class LastDigitChecker {
    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree) {
        if (
            !isValid(numOne)
            || !isValid(numTwo)
            || !isValid(numThree)
        ) {
            return false;
        }

        int lastDigitOne = numOne % 10;
        int lastDigitTwo = numTwo % 10;
        int lastDigitThree = numThree % 10;

        if (
            lastDigitOne == lastDigitTwo
            || lastDigitOne == lastDigitThree
            || lastDigitTwo == lastDigitThree
        ) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }
}
