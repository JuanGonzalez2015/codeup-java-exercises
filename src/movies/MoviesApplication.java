//package movies;
//public class MoviesApplication {
//    public static void main(String[] args) {
//        Input input = new Input();
//        printMovies(input.showOptions());
//    }
//    private static void printMovies(int userInput) {
//        switch (userInput) {
//            case 0:
//                return;
//            case 1:
//                MovieArray.getMovies();
//                break;
//            case 2:
//                MovieArray.getMoviesByCategory("animated");
//                break;
//            case 3:
//                MovieArray.getMoviesByCategory("drama");
//                break;
//            case 4:
//                MovieArray.getMoviesByCategory("horror");
//                break;
//            case 5:
//                MovieArray.getMoviesByCategory("scifi");
//                break;
//            case 6:
//                MovieArray.getMoviesByCategory("musical");
//                break;
//            default:
//                System.out.println("Invalid choice");
//        }
//        Input input = new Input();
//        printMovies(input.showOptions());
//    }
//}
//
//package movies;
//        import java.util.Scanner;
//public class Input {
//    Scanner scanner = new Scanner(System.in);
//    //    static int userInput = 0;
////    public static int getUserInput() {
////        return userInput;
////    }
////    public static void setUserInput(int userInput) {
////        Input.userInput = userInput;
////    }
//    public int showOptions() {
//        {
//            System.out.println("What would you like to do?\n" +
//                    "\n" +
//                    "0 - exit\n" +
//                    "1 - view all movies\n" +
//                    "2 - view movies in the animated category\n" +
//                    "3 - view movies in the drama category\n" +
//                    "4 - view movies in the horror category\n" +
//                    "5 - view movies in the sci-fi category\n"+
//                    "6 - view movies in the musical category\n"+
//                    "\n" +
//                    "Enter your choice: ");
//            //setUserInput(scanner.nextInt());
//            return scanner.nextInt();
//        }
//    }
//}
