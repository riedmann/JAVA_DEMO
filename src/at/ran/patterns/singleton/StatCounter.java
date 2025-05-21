package at.ran.patterns.singleton;

public class StatCounter {
    private static int count= 0;

    public static int getCount() {
        return count;
    }
    public static void increment() {
        count++;
    }
}
