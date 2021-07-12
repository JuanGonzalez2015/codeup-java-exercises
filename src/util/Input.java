package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);

    }

    public String getString() {
        System.out.println("Enter a string");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("enter [y/n]");
        String input = this.scanner.next();
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max) {
        System.out.println("enter a number between " + min + " and " + max);
        int userNumber = scanner.nextInt();
        if (userNumber <= max && userNumber >= min) {
            System.out.println("your number lets you live");
            return userNumber;
        }
        System.out.println("you have chosen death, you have one more try");

        return getInt(min, max);


    }

    public double getDouble(double min, double max) {
        System.out.println("enter a number between " + min + " and " + max);
        double userNumber = scanner.nextDouble();
        if (userNumber <= max && userNumber >= min) {
            System.out.println("your number lets you live");
            return userNumber;
        }
        System.out.println("you have chosen death, you have one more try");

        return getDouble(min, max);


    }

}

