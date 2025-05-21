package at.ran.patterns.singleton;

public class Main {
    public static void main(String[] args) {
       Counter c1 = Counter.getInstance();
       Counter c2 = Counter.getInstance();
       c1.increment();
       c2.increment();

       System.out.println(c1.getCount());
    }
}
