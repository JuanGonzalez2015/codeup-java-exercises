import java.util.Scanner;

public class StringsLecture {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//     String msg = "Hello";
//     System.out.println(msg);
//     msg = msg + ", how are you?";
//     System.out.println(msg);

//string comparison
        // .equals()
//     System.out.println("dou you like pizza [y/n? ");
//     String userInput = sc.next();
//     System.out.println(userInput);
//     if(userInput.equals("y")){
//         System.out.println("yes i like pizza");
//     }else{
//         System.out.println("no pizza for me");
//     }
//     // .equalsIgnoreCase
//     System.out.println("What is your name ");
//     String userInput = sc.next();
//     System.out.println(userInput);
//     if(userInput.equals("Juan")){
//         System.out.println("yes that is my name is exactly");
//     }else if(userInput.equalsIgnoreCase("Juan")){
//         System.out.println("that is my name but you forgot to capitlaiza a letter");
//     }else{
//         System.out.println("this is not my name");
//     }
        // .startsWith()

//     String myFaveBand = "The Doors";
//     System.out.println(myFaveBand.startsWith("The"));
        // .endswith
////    String myFaveBand = "The Doors";
////     System.out.println(myFaveBand.endsWith("band"));
////     System.out.println(myFaveBand.endsWith("Doors"));
// }
//}

//        TODO: create a String variable that holds this sentence: "Red
//         Orange Blue Yellow Green Purple". Prompt the user to type in
//         their favorite color, if their fave color is the same as the
//         first word in the String, then print out "my fave color:
//         userColor is the first one". If their fave color is last, then print out "my fave color: userColor is last"


        String mySentence = "Red Orange Blue Yellow Green Purple";

        System.out.println("Enter your favorite color");
        String userInput = sc.next();
if(mySentence.startsWith("Red")){
    System.out.println("that is my color too");
}else{
    System.out.println("that color is ugly");
}
    }
}