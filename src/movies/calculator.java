package movies;

import java.util.Scanner;

public class calculator {


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String equation = input.nextLine();
        int opLocation = equation.indexOf("+");
        if (opLocation == -1) {
            opLocation = equation.indexOf("-");
        }
        if (opLocation == -1) {
            opLocation = equation.indexOf("*");
        }
        if (opLocation == -1) {
            opLocation = equation.indexOf("/");
        }
        String number = equation.substring(0, opLocation);
        int numberOne = Integer.parseInt(number);
        number = equation.substring(opLocation + 1);
        int numberTwo = Integer.parseInt(number);
        String op = equation.substring(opLocation, opLocation + 1);
        int result;
        if (op.equals("+")) {
            result = numberOne + numberTwo;
            System.out.print("The answer is: " + result + " .\n");
        } else if (op.equals("-")) {
            result = numberOne - numberTwo;
            System.out.print("The answer is: " + result + " .\n");
        } else if (op.equals("*")) {
            result = numberOne * numberTwo;
            System.out.print("The answer is: " + result + " .\n");
        } else if (op.equals("/")) {
            result = numberOne / numberTwo;
            System.out.print("The answer is: " + result + " .\n");
        }
    }
}