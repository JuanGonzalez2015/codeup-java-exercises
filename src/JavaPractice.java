import java.util.Scanner;

public class JavaPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
                String[] studentsArr =
                        {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
                                "Diamond", "Erik", "Grady", "Jesse", "Joshua",
                                "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
                                "Raul", "Ricardo", "Richard", "Robert", "Sam",
                                "Sean", "Stephen", "Tiffany", "Wagner", "Laura",
                                "Casey", "Dorian", "Tristan", "Jordy"};
                int randomNum = (int) (Math.random() * 28);
                String randomName = studentsArr[randomNum];
                String userInput = "Juan";
        System.out.print("What is your name? ");
        System.out.println();

        String firstName = sc.next();
        System.out.printf("you entered %s\n" , firstName);
        if(firstName.equals(userInput)){
            System.out.println("woah! you guessed the random name");
        }else{
            System.out.printf("you entered the wrong name");
        }
            }
        }
