public class ObjectOrientedProgramming {

    public static void main(String[] args) {
        // tell me about a person

    Person person = new Person();
    Person tiffannyPerson = new Person();
    tiffannyPerson.setName("Tiffanny");

    person.setName("Jo-Bob");

        System.out.println(person.getName());
        System.out.println(person.getEntertainment("ride roller coasters"));
        System.out.println(tiffannyPerson.getEntertainment("tubing the river"));
    }

}
