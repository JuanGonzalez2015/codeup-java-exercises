//
//
//    import java.util.Arrays;
//    public class ArrayExercises {
//        public static void main(String[] args) {
//            int[] numbers = {1, 2, 3, 4, 5};
//            System.out.println(numbers);
//            Person[] persons = new Person[3];
//            persons[0] = new Person("Prachi", "Phatak");
//            persons[1] = new Person("Casey", "Edwards");
//            persons[2] = new Person("Laura", "Ruiz");
//            for (Person person : persons) {
//                person.print();
//            }
//            Person[] newPersons = Person.addPerson(persons, new Person("Dorian", "xxx"));
//            for (Person person : newPersons) {
//                person.print();
//            }
//        }
//    }
//    import java.util.Arrays;
//    class Person implements Printable {
//        String firstName;
//        String lastName;
//        /**
//         * @param firstName - Person's first name
//         * @param lastName  - Person's last name
//         */
//        public Person(String firstName, String lastName) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//        }
//        public String getFirstName() {
//            return firstName;
//        }
//        public void setFirstName(String firstName) {
//            this.firstName = firstName;
//        }
//        public String getLastName() {
//            return lastName;
//        }
//        public void setLastName(String lastName) {
//            this.lastName = lastName;
//        }
//        @Override
//        public void print() {
//            System.out.println("Person's first name is " + firstName
//                    + ". Person's last name is " + lastName + ".");
//        }
//        public static Person[] addPerson(Person[] personArray, Person person) {
//            Person[] personArr = Arrays.copyOf(personArray, personArray.length + 1);
//            personArr[personArr.length - 1] = person;
//            return personArr;
//        }
//    }
