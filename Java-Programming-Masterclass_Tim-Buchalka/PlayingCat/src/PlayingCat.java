public class PlayingCat {
    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if (temperature >= 25 && (temperature <= (isSummer ? 45 : 35))) {
            return true;
        }
        return false;
    }
}
