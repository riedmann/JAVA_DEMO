package at.ran.inheritance;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(4, 7);
        System.out.println(result);

        ScienceCalculator scienceCalculator = new ScienceCalculator();
        int result2 = scienceCalculator.sinus(7);
        System.out.println(result2);
    }
}
