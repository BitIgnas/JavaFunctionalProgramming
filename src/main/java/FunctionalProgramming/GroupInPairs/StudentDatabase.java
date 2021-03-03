package FunctionalProgramming.GroupInPairs;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class StudentDatabase {

    public static List<Student> studentList = new ArrayList<>();

    public static void constructStudentList() {

        studentList.add(new Student("Rokas", "Jasaitis", LocalDate.of(2001, 5, 5),true));
        studentList.add(new Student("Mikas", "Katinas", LocalDate.of(2002, 8, 1),false));
        studentList.add(new Student("Jonas", "Valanciunas", LocalDate.of(1990, 1, 1),false));
        studentList.add(new Student("Arturas", "Gaizauskas", LocalDate.of(1998, 7, 10),true));
        studentList.add(new Student("Domantas", "Butenas", LocalDate.of(2001, 2, 28),false));
        studentList.add(new Student("Milda", "Butinite", LocalDate.of(2002, 4, 5),false));
        studentList.add(new Student("Nojus", "Buivydas", LocalDate.of(1999, 9, 10),false));
        studentList.add(new Student("Jogaila", "Arunaitis", LocalDate.of(1999, 1, 26),false));
        studentList.add(new Student("Vytautas", "Karalius", LocalDate.of(1967, 12, 10),true));
        studentList.add(new Student("Mantas", "Jovalsa", LocalDate.of(1987, 10, 9),true));
        studentList.add(new Student("Agne", "Salciute", LocalDate.of(2003, 11, 5),false));
        studentList.add(new Student("Artur", "Paulaiskas", LocalDate.of(2001, 7, 23),true));
        studentList.add(new Student("Tomas", "Ivanauskas", LocalDate.of(1997, 1, 5),false));
        studentList.add(new Student("Rokas", "Mikutavicius", LocalDate.of(1996, 3, 5),true));
        studentList.add(new Student("Rigita", "Agnetaite", LocalDate.of(2000, 2, 5),false));
    }

    public static void printAllElement(){
        for (Student student : studentList) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }

    public static void displayStudentNameAlphabetically() {

        System.out.println("Names alphabetically: ");
        studentList.stream().sorted(Comparator.comparing(Student::getFirstName))
                .collect(Collectors.toList())
                .forEach(student -> System.out.println(student.getFirstName()));
    }
}
