import java.util.Scanner;

public class Arrays {

    public static void main (String[] args){
       int[] intArray = getIntArray();

    }

    public static int[] getIntArray(){
        return new int[]  {1, 2, 3};
    }

    public static int[] getIntArray(int length){
        int[] intArray = new int[length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2;
        }
      return intArray;
    }

    public static String[] getNameArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many names do you wnat to enter");
         int namesLength = scanner.nextInt();
         String[] namesArr = new String[namesLength];

         for (int i = 0; i < namesLength; i++){
             namesArr[i] = scanner.next();

         }
         return namesArr;
    }
}
