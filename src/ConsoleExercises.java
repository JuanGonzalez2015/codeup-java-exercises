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

//        Scanner sizeOfCodeup = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//
//        String userInput = sizeOfCodeup.next();
//
//        System.out.printf("You have entered: %s\n", userInput);

//        double pi = 3.14159;
//        System.out.printf("The value of PI is approx: %.2f.", pi);

//        Scanner sc = new Scaner(System.in);
//        System.out.println("Please enter an integer:");
//        int userInput = sc.nextInt();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter three words:");
//
//        String userInput1 = sc.next();
//        String userInput2 = sc.next();
//        String userInput3 = sc.next();
//
//        System.out.println(userInput1);
//        System.out.println(userInput2);
//        System.out.println(userInput3);
//

//        Scanner sc = new Scaner(System.in);
//        sc.useDelimiter(".");
//        System.out.println("Please enter three words");
//        String userInput1 = sc.nextLine();
//
//        System.out.println(userInput1);


        Scanner sc = new Scanner(System.in);
//        int length = Integer.parseInt(sc.nextLine());
//        int width = Integer.parseInt(sc.nextLine());

//        float length = float.parseFloat(sc.nextLine());
//        float width = float.parseFloat(sc.nextLine());
//
//        System.out.printf("Perimieter: %s\n",(2 * length) + (2 * width));
//        System.out.printf("Area: %s", length * width);

//        String myFaveAnimal = "frog";
//        System.out.println(myFaveAnimal);
//
//        int chanceOfRain = 60;
//        if(chanceOfRain >= 50){
//            System.out.println("stay inside");
//        }

//        boolean isWarm = true;
//        boolean isSunny = true;
//        if(isWarm | isSunny){
//            System.out.println("go swimming");
//        }
//
//        if(isWarm | isSunny){
//            System.out.println("go swimming");
//        }

        String myName = "Laura";
        String yourName = "Tifanny";


        System.out.println(myName.equals(yourName));
        System.out.println(myName.equalsIgnoreCase(yourName));

        if(yourName.equals(myName)){
            System.out.println("we are twins that is it.");
        }
 }
}


