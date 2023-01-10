public class Main {
    public static void main(String[] args) {
        // Checks if the cat is playing outside in summer when the temperature is 10.
        System.out.println(isCatPlaying(true, 10));

        // Checks if the cat is playing outside not in summer when the temperature is 36.
        System.out.println(isCatPlaying(false, 36));

        // Checks if the cat is playing outside not in summer when the temperature is 35.
        System.out.println(isCatPlaying(false, 35));
    }

    /**
     * Checks if the cat is playing outside.
     */
    public static boolean isCatPlaying(boolean summer, int temperature) {
        return (summer) ? (temperature > 24 && temperature < 46) : (temperature > 24 && temperature < 36);
    }
}