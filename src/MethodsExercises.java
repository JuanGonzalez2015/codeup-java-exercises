public class MethodsExercises {

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

        public static void main(String[] args) {
        System.out.println("What is your favorite basketball team");

        System.out.println(team("that is the best team"));
    }

    public static String team(String myTeam) {
        System.out.println("DPR Basketball Team: ");
        return myTeam;


}
}
