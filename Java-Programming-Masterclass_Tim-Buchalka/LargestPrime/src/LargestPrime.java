public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }

        int largestPrime = number;

        for(int i = number/2; i > 0; i--){
            if(largestPrime % i == 0 && i != 1){
                largestPrime = i;
            }

        }
        return largestPrime;
    }
}
