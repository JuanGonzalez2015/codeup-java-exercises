import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

//        int i = 0;
//        do {
//            i = i + 2;
//            System.out.println(i);
//
//        }while( i < 100);
//
//        }

//    int i = 100;
//        do {
//        i = i - 5;
//        System.out.println(i);
//
//    }while( i > -10);

//        for (int i = 0; i < 100; i = i + 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i > -10; i = i - 5) {
//            System.out.println(i);
//        }

//        for (int i = 1; i < 101; i++) {
//
//            if(i % 3 == 0){
//                System.out.println("Fizz");
//            }if(i % 5 == 0){
//                System.out.println("Buzz");
//            }if( i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz " + i);
//            } else{
//
//                System.out.println(i);
//            }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number");
//
//        int input = scanner.nextInt();
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i = 1; i < input + 1; i++) {
//            System.out.println( i + " | " + (i * i ) + " | " + (i * i * i));
//        }
//
//


        Scanner scanner = new Scanner(System.in);
        gradeApplication(scanner);


    }

    public static void gradeApplication(Scanner scanner) {
        System.out.println("Enter a number from 0 - 100");
        int input = scanner.nextInt();
        if (input <= 100 && input >= 88) {
            System.out.println("Your grade is an A");
            yesNo(scanner);
        }
        if (input <= 87 && input >= 80) {
            System.out.println("Your grade is an B");
            yesNo(scanner);
        }
        if (input <= 79 && input >= 67) {
            System.out.println("Your grade is an C");
            yesNo(scanner);
        }
        if (input <= 66 && input >= 60) {
            System.out.println("Your grade is an D");
            yesNo(scanner);
        }

        if (input <= 59 && input >= 0) {
            System.out.println("Your grade is an F");
            yesNo(scanner);
        }


    }

    public static void yesNo(Scanner scanner) {
        System.out.println("do you want to continue: y/n? ");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("y")) {
            gradeApplication(scanner);
        } else if (choice.equalsIgnoreCase("n")) {
            System.out.println("Goodbye, have a great day");
            return;
        }

    }
}


