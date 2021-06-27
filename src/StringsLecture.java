import java.util.Scanner;

public class StringsLecture {

 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     String msg = "Hello";
     System.out.println(msg);
     msg = msg + ", how are you?";
     System.out.println(msg);

//string comparison
     // .equals()
     System.out.println("dou you like pizza [y/n? ");
     String userInput = sc.next();
     System.out.println(userInput);
     if(userInput.equals("y")){
         System.out.println("yes i like pizza");
     }else{
         System.out.println("no pizza for me");
     }
     // .equalsIgnoreCase
     // .startsWith()
     // .endswith

    }
}

