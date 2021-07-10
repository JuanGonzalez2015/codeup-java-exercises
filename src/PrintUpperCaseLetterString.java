public class PrintUpperCaseLetterString{
    public static void main(String[] args) {
        String str = "We Are An American Band";
        for(int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                System.out.println(str.charAt(i));
            }
        }
    }
}
