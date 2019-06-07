public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        final int BIG_FLOUR_BAG = 5;
        final int SMALL_FLOUR_BAG = 1;
        int goalCopy = goal;
        int sum = 0;


        for (int i = 0; i < bigCount; i++) {
            if (goalCopy >= BIG_FLOUR_BAG) {
                sum += BIG_FLOUR_BAG;
                goalCopy -= BIG_FLOUR_BAG;
            } else {
                break;
            }
        }


        for (int i = 0; i < smallCount; i++) {
            if (goalCopy >= SMALL_FLOUR_BAG) {
                sum += SMALL_FLOUR_BAG;
                goalCopy -= SMALL_FLOUR_BAG;
            } else {
                break;
            }
        }

        return sum == goal;
    }
}
