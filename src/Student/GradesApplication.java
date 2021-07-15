//package Student;
//
//import util.Input;
//
//import java.util.HashMap;
//import java.util.Locale;
//import java.util.Scanner;
//
//public class GradesApplication {
//    public static void main(String[] args) {
//        Input input = new Input();
//        HashMap<String, Student> students = new HashMap<>();
//        students.put("jgonzalez", new Student("Juan", 7, 8, 9));
//        students.put("cshaw", new Student("Casey", 4, 8, 9));
//        students.put("thadden", new Student("Tiff", 5, 8, 9));
//        students.put("rlara", new Student("Richard", 9, 8, 9));
//
//        System.out.println("Welcome! \n\n Here are the GitHub usernames of our students");
//
//        do {
//            System.out.println("\n");
//            for (String key : students.keySet()) {
//                System.out.println(" | " + key + "|");
//            }
//            System.out.println(" \n\n What student would you like to see more information on?");
//            System.out.println("> ");
//
//            String userInput = input.getString().toLowerCase(Locale.ROOT);
//            Student student = students.get(userInput);
//            if (student == null) {
//                System.out.println("no student found");
//            } else {
//                System.out.printf("Name: %s - GitHub Username: %s", student.getName(), userInput);
//                System.out.printf("Current Average: %.1f\n\n", student.getGradeAverage(), userInput);
//            }
//
//
//        } while (input.yesNo());
//
//    }
//
//
//}
