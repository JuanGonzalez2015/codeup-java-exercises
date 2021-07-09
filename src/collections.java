import java.util.ArrayList;

public class collections {

    public static void main(String[] args) {
        ArrayList<String> stringArr = new ArrayList<>();

        stringArr.add("Juan");
        System.out.println(stringArr);
        System.out.println(stringArr.size());
        System.out.printf("the name without the brackets is: %s\n", stringArr.size());
        System.out.println(stringArr.get(0));///prints out without the brackets
        System.out.println(stringArr.hashCode());

        //Remove elements
        stringArr.remove(0);
        System.out.println(stringArr.hashCode());
//        ArrayList<String> stringArr = new ArrayList<>(), stringArrCopy = new ArrayList<>();
    }
}
