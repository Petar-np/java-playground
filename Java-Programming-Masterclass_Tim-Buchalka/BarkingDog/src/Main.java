public class Main {
    public static void main(String[] args) {
        boolean first = BarkingDog.shouldWakeUp(true, 1);
        boolean second = BarkingDog.shouldWakeUp(false, 2);
        boolean third = BarkingDog.shouldWakeUp(true, 8);
        boolean fourth = BarkingDog.shouldWakeUp(true, -1);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}
