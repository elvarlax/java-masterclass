public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature > 24 && temperature < 46;
        } else {
            return temperature > 24 && temperature < 36;
        }
    }

    public static void main(String[] args) {
        /*
        The cats spend most of the day playing.
        In particular, they play if the temperature is between 25 and 35 (inclusive).
        Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
        Write a method isCatPlaying that has 2 parameters.
        Method need to return true if the cat is playing, otherwise return false.
        1st parameter should be of type boolean and be named summer it represents if it is summer.
        2nd parameter represents the temperature and is of type int with the name temperature.

        Examples of input/output:
        *   isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45
        *   isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)
        *   isCatPlaying(false, 35); should return true since temperature is in range 25 - 35
        */
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
}