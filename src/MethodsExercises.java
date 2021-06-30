import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args){
        getInteger(1,10);
    }

    // syntax
    // public - how visible your method is to other classes
    // static - available only for this class and not an instance of a class
    // void -

//    public static void main(String[] args) {
//        System.out.println("Hello World");
//
//        System.out.println(greeting(24));
//    }
//
//    public static int greeting(int age) {
//        System.out.println("age: " + age);
//        return age;


    //    TODO: create a new method that accepts the name of a basketball
//     team (ex: the spurs) and returns a String that says
//     "[basketballTeam] is the best team.". Invoke that method within
//     your main method (remember to pass in the name of the basketball
//     team). print out the result of the new method.


//    ///not working
//    public static void main(String[] args) {
//        System.out.println("Democratic People's Republic of Korea national basketball team");
//        System.out.println(myTeam());
//    }
//
//    public static String myTeam(String team) {
//        System.out.println("the best team in the world");
//        return myTeam;
//
//        public static void main(String[] args) {
//        System.out.println("What is your favorite basketball team");
//
//        System.out.println(team("that is the best team"));
//    }
//
//    public static String team(String myTeam) {
//        System.out.println("DPR Basketball Team: ");
//        return myTeam;


//
//        public static int getInteger(int min, int max){
//            Scanner scanner = new Scanner(System.in);
//            String userChoice ="";
//            int userInput = 0;
//            do{
//                System.out.printf("Enter int between %d-%d", min, max);
//                userInput = scanner.nextInt();
//                if(userInput > min && userInput < max){
//                    System.out.println("in range");
//                    break;
//                }else{
//                    System.out.println("not in range");
//                }
//                System.out.println("do you want to continue? (y/n)");
//                userChoice = scanner.next();
//            }while (!userChoice.equalsIgnoreCase("n"));
//        return userInput;


    public static int getInteger(int min, int max){

    int userInput = 0;
        System.out.printf("Please enter a number between %S and %s:\n", min, max);
    Scanner sc = new Scanner(System.in);

    userInput = sc.nextInt();

    if (userInput > max || userInput < min){
        getInteger(min, max);
    }

    return userInput;

}
}
