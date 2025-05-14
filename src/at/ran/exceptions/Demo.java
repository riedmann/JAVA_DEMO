package at.ran.exceptions;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            int number = Integer.parseInt(input);
            System.out.println(number);
            if (number == 0){
                System.out.println("zero");
                calculateSomething(4,4);
            }
        }
       
      
    }

    private static void calculateSomething(int i, int i1) throws IllegalArgumentException {
        int result = i +i1;
        System.out.println(result);
        if (i==0){
            throw new IllegalArgumentException("i cannot be zero");
        }
    }
}
