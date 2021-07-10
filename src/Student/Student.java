package Student;

import java.util.ArrayList;


public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<String> namesArr = new ArrayList<>();
        namesArr.add("Juan");
        namesArr.add("Sean");
        namesArr.add("Stephen");
        namesArr.add("Nathan");
        namesArr.add("Erik");
        System.out.printf("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");
        System.out.println(namesArr);
//        System.out.printf("Here are the grades of our students in order:");
//        ArrayList<String> gradesArr = new ArrayList<>();
//        gradesArr.add("A");
//        gradesArr.add("B");
//        gradesArr.add("C");
//        gradesArr.add("D");
//        gradesArr.add("F");
//
//        System.out.println(gradesArr);

    }
    public Student(String name, int ...grades){
        setName(name);
        addGrades(grades);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    public void addGrades(int ...grades){
        for(int grade: grades){this.addGrades();}
    }

    public double getGradeAverage(){
        double sum = 0;
        for(int grade: this.grades){
            sum += grade;
        }
        return sum / this.grades.size();
    }
}
