import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){


//        System.out.println("My name is Juan");
//        System.out.println("Hey look! New Line");
////sout without the ln will print 2 lines in the same line vs ln that will creat 2 lines
//        //so will printf
//        System.out.print();

        ///%s will concatenate the string variable but has to have printf
        //if you switch the %S to uppercase S it will print out in upper case
//        String name = "Juan";
//        System.out.printf("My name is %s ", name);
//
//        String mySentence = String.format("My name is %S", name);
//        System.out.println(mySentence);

//        String title = "The Conquistador";
//        String name = "Juan Gonzalez";
//        String fatality = "The Spine Taker";
//        String myMotto = "Hell Yeah";
//
//        System.out.printf("I am the %s and my name is %s, my fatality is %s, and my motto is: %s", title, name, fatality, myMotto);
//
//        float currencyInPennies = 1000.0f;
//        System.out.printf("I'll sell you a swamp land for $%.2f per acre", currencyInPennies);

/////.next method record input from the user
//        Scanner sc = new Scanner(System.in);
////        System.out.println("What is your first name?");
////        String firstName = sc.next();
//////        String lastName = sc.next();
////        System.out.printf("You entered: %s\n", firstName);
////        System.out.printf("Your last name is %s\n", lastName );
//        ////.nextInt();
//        System.out.print("Enter an number:");
//        int myNum = sc.nextInt();
//        System.out.println(myNum);
//        System.out.print(myNum);

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter a number: ");
//
//        int num = sc.nextInt();
//
//        System.out.printf("Your number was %d\n", num);
//
//        System.out.println("Please type a sentence:\r\n");
//
//        String sentence = sc.nextLine();
//
//        System.out.println(sentence);
//
//Integer.parseInt(sc.next());
//

        Scanner sizeOfCodeup = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String userInput = sizeOfCodeup.next();

        System.out.printf("You have entered: %s\n", userInput);

 }
}

